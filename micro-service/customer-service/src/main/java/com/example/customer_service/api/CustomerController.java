package com.example.customer_service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dewmith Mihisara
 * @date 2024-05-31
 * @since 0.0.1
 */
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @GetMapping("/get")
    public String get() {
        return "Hello from Customer Service";
    }
}
