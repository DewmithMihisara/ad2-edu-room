package com.example.item_service.api;

import com.example.item_service.dto.ItemDTO;
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

    @GetMapping("/postItemInCustomer")
    public ItemDTO postItemInCustomer() {
        return restTemplate.postForObject("http://customer-service/api/v1/customer/post",
                new ItemDTO("I-001", "Item 1 from Item Service", "Item 1 Description from Item Service")
                , ItemDTO.class);
    }

    @GetMapping("/putItemInCustomer")
    public void putItemInCustomer() {
        restTemplate.put("http://customer-service/api/v1/customer/put",
                new ItemDTO("I-001", "Item 1 from Item Service", "Item 1 Description from Item Service"));
    }

    @GetMapping("/deleteItemInCustomer")
    public void deleteItemInCustomer() {
        restTemplate.delete("http://customer-service/api/v1/customer/delete/I-001");
    }
}
