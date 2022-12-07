package com.example.demo.controller;


import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

}
