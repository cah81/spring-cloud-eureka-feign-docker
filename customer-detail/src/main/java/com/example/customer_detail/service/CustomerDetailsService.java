package com.example.customer_detail.service;

import com.example.customer_detail.dto.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "customer")
public interface CustomerDetailsService {

    @GetMapping(value = "/details")
    public Customer getCustomerDetails();
}
