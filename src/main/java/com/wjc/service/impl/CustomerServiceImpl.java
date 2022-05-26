package com.wjc.service.impl;

import com.wjc.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wjc.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public void searchAllInformationByName(String name) {
        customerDao.searchAllInformationByName(name);
    }

    @Override
    public void findByID(int id) {
        customerDao.findByID(id);
    }
}
