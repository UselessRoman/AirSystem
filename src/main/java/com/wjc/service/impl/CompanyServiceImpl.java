package com.wjc.service.impl;

import com.wjc.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wjc.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService
{
    @Autowired
    private CompanyDao companyDao;

    @Override
    public void averageTotalDistance() {
        companyDao.averageTotalDistance();
    }

    @Override
    public int totalDistance()
    {
        companyDao.totalDistance();
        return 0;
    }
}
