package com.wjc.service;

import com.wjc.domain.Customer;

import java.util.List;

public interface CustomerService
{
    List<Customer>  searchAllInformationByName(String name);
    Customer findByID(int id);

    List<Customer> findByMainlandIDAndDestination(String destination);
}
