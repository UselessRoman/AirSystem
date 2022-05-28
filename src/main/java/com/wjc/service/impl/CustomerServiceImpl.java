package com.wjc.service.impl;

import com.wjc.dao.CustomerDao;
import com.wjc.domain.Customer;
import com.wjc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer searchAllInformationByName(String name) {

        return customerDao.searchAllInformationByName(name);
    }

    @Override
    public Customer findByID(int id) {
        return customerDao.findByID(id);
    }

    @Override
    public List<Customer> findByMainlandIDAndDestination(String destination) {
        return customerDao.findByMainlandIDAndDestination(destination);
    }
}
