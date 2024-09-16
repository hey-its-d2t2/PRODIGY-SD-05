package com.PRODIGY_SD_05.controller;

import com.PRODIGY_SD_05.model.Product;
import com.PRODIGY_SD_05.service.CsvExportService;
import com.PRODIGY_SD_05.service.ScrapingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/scrap")
public class WebScrapingController {

    @Autowired
    private ScrapingService scrapingService;
    @Autowired
    private CsvExportService csvExportService;

    @PostMapping("/scrape")
    public List<Product> scrapeProducts(@RequestParam("url") String url) {
        return scrapingService.scrapeProductData(url);
    }

    @PostMapping("/download")
    public ResponseEntity<InputStreamResource> downloadCsv(@RequestBody List<Product> products) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        csvExportService.writeDataToCsv(products, outputStream);

        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        InputStreamResource file = new InputStreamResource(inputStream);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=products.csv")
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .contentLength(outputStream.size())
                .body(file);
    }


    // write code for http/https other errors and warnings, and if internet is not connected, not allowed, or similar errors
    // which are needs to be handled.
}
