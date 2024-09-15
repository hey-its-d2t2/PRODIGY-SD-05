package com.PRODIGY_SD_05.service;

import com.PRODIGY_SD_05.model.Product;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

@Service
public class ScrapingService {
    public List<Product> scrapeProductData(String url) {
        List<Product> products = new ArrayList<>();

        try {
            Document doc = Jsoup.connect(url).get();
            Elements productElements = doc.select(".product_pod"); // This is data selector, Adjust the selector to match your target

            for (Element element : productElements) {
                String name = element.select("h3 a").attr("title");
                String price = element.select(".price_color").text();
                String rating = element.select(".star-rating").attr("class").split(" ")[1]; // Extract rating class

                products.add(new Product(name, price, rating));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }
}
