package com.example.customer_detail.controller;

import com.example.customer_detail.dto.Customer;
import com.example.customer_detail.service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDetailController {

    @Autowired
    CustomerDetailsService customerDetailsService;

    @GetMapping(value = "feign/details")
    public Customer getDetails(){
        return customerDetailsService.getCustomerDetails();
    }
}
