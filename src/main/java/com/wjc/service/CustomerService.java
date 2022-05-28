package com.wjc.service;

import com.wjc.domain.Customer;

public interface CustomerService
{
    Customer searchAllInformationByName(String name);
    void findByID(int id);
}
