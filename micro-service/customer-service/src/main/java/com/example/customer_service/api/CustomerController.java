package com.example.customer_service.api;

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
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final RestTemplate restTemplate;

    public CustomerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/get")
    public String get() {
        return "Hello from Customer Service";
    }

    @GetMapping("/getItemInCustomer")
    public String getItemInCustomer() {
        return restTemplate.getForObject("http://localhost:8081/api/v1/item/get", String.class);
    }


    @PostMapping("/postItemInCustomer")
    public String post() {
        return "Hello from Customer Service";
    }

}
