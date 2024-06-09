package com.example.item_service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-31
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public String get() {
        return "Hello from Item Service";
    }

    @GetMapping("/postCustomerInItem")
    public String post() {
        return restTemplate.postForObject("http://localhost:8082/api/v1/customer/postItemInCustomer", "", String.class);
    }
}
