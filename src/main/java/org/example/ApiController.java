package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    private static final List<Product> PRODUCTS = new ArrayList<>();

    static {
        for (int i = 1; i <= 30; i++) {
            PRODUCTS.add(new Product("imageURL" + i, "productName" + i, i * 10.0, i * 10, i % 2 == 0));
        }
    }

    @GetMapping("/api")
    public String getApi() {
        return "Hello from API!";
    }
    @GetMapping("/pagedApi")
    public List<Product> getPagedApi(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "15") int numberOfProducts) {
        numberOfProducts = Math.min(numberOfProducts, 30);
        int start = (page - 1) * numberOfProducts;
        int end = Math.min(start + numberOfProducts, PRODUCTS.size());
        return PRODUCTS.subList(start, end);
    }
}