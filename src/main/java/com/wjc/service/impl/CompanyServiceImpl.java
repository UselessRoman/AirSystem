package com.wjc.service.impl;

import com.wjc.dao.CompanyDao;
import com.wjc.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wjc.service.CompanyService;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService
{
    @Autowired
    private CompanyDao companyDao;



    @Override
    public List<Company> findAverageDistance() {
        return companyDao.findAverageDistance();
    }

    @Override
    public List<Company> findTotalDistance() {
        return companyDao.findTotalDistance();
    }

}
