package com.PRODIGY_SD_05.service;

import com.opencsv.CSVWriter;
import com.PRODIGY_SD_05.model.Product;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@Service
public class CsvExportService {

  /*  public void writeDataToCsv(List<Product> productList, String filePath) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] header = {"Name", "Price", "Rating"};
            writer.writeNext(header);

            for (Product product : productList) {
                String[] data = {product.getName(), product.getPrice(), product.getRating()};
                writer.writeNext(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public void writeDataToCsv(List<Product> products, OutputStream outputStream) throws IOException {
        // Use BufferedWriter or similar to write CSV data to the outputStream
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream))) {
            writer.write("Name,Price,Rating\n");
            for (Product product : products) {
                writer.write(product.getName() + "," + product.getPrice() + "," + product.getRating() + "\n");
            }
        }
    }
}
