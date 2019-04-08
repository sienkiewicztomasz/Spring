package com.allegro.trade.services;

import com.allegro.trade.domain.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> listAllCustomer();

    Customer getCustomerById(Integer id);

    Customer saveOrUpdateCustomer(Customer customer);

    void deleteCustomer(Integer id);
}
