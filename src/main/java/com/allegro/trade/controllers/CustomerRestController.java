package com.allegro.trade.controllers;


import com.allegro.trade.domain.Customer;
import com.allegro.trade.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class CustomerRestController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.listAllCustomer();
    }

    @RequestMapping(path = "/customer/{id}",
            produces = MediaType.APPLICATION_XML_VALUE)
    public Customer getCustomerBy(@PathVariable Integer id){
        return customerService.getCustomerById(id);
    }

    @RequestMapping("/customer/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCustomerBy(@PathVariable Integer id){
        customerService.deleteCustomer(id);
    }

    @PostMapping(path = "/customer/update",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)

    public void updateCustomer(@RequestBody Customer customer) {
        customerService.saveOrUpdateCustomer(customer);
    }

    @PostMapping(path = "/customer/new",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void saveCustomer(@RequestBody Customer customer){
        customerService.saveOrUpdateCustomer(customer);
    }

}
