package com.example.customer_service.api;

import com.example.customer_service.dto.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/post")
    public ItemDTO post(@RequestBody ItemDTO itemDTO) {
        System.out.println("this is post method that call using item service : "+itemDTO.toString());
        itemDTO.setId("I-001");
        itemDTO.setName("Item 1 from Customer Service");
        itemDTO.setDescription("Item 1 Description from Customer Service");
        return itemDTO;
    }

    @PutMapping("/put")
    public ItemDTO put(@RequestBody ItemDTO itemDTO) {
        System.out.println("this is put method that call using item service : "+itemDTO.toString());
        itemDTO.setId("I-001");
        itemDTO.setName("Item 1 from Customer Service");
        itemDTO.setDescription("Item 1 Description from Customer Service");
        return itemDTO;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        System.out.println("this is delete method that call using item service : "+id);
    }

}
