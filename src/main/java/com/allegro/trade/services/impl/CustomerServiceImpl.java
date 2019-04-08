package com.allegro.trade.services.impl;

import com.allegro.trade.domain.Customer;
import com.allegro.trade.repo.CustomerRepository;
import com.allegro.trade.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

//    private Map<Integer, Customer> customers;

    @Autowired
    private CustomerRepository repository;

    public CustomerServiceImpl() {
//        customers = new HashMap<>();
//        loadCustomers();
//    }
//
//    private void loadCustomers() {
//        for (int i=1; i<6; i++) {
//            Customer c = new Customer();
//            c.setId(i);
//            c.setFirstName("Adam" + i);
//            c.setLastName("Nowak" + i);
//            c.setPhoneNumber("48 555 999 00" + i);
//            c.setEmail("AdamNowak@"+i+".com");
//            c.setCity("Kraków");
//            c.setZipCode("00-999");
//            c.setState("Main");
//            customers.put(i, c);
//        }
    }


    @Override
    public List<Customer> listAllCustomer() {
        //return new ArrayList<>(customers.values());
        List<Customer> result = new LinkedList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Customer getCustomerById(Integer id) {

        //return customers.get(id);
        Optional <Customer> result = repository.findById(id);
        return result.orElse(new Customer());
    }

    @Override
    public Customer saveOrUpdateCustomer (Customer customer) {

        if (customer != null) {
            return repository.save(customer);
        }else {
            throw new RuntimeException("Can't be null!!!");
        }
//        if(customer != null){
//            if (customer.getId() == null) {
//                customer.setId(getNextKey());
//            }
//            customers.put(customer.getId(), customer);
//        }else {
//            throw new RuntimeException("Can't be null!!!");
//        }
//
//        return getCustomerById(customer.getId());

    }

    @Override
    public void deleteCustomer(Integer id) {

        repository.deleteById(id);
    }

//    private Integer getNextKey() {
//        return Collections.max(customers.keySet()) + 1;
//    }
}
