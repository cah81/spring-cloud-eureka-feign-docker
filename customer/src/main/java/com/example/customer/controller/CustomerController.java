package com.example.customer.controller;

import com.example.customer.dto.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping(value = "/details")
    public Customer getDetails(){
        return new Customer("abc","xyz","server 1");
    }
}
