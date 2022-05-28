package com.wjc.service;

import com.wjc.domain.Company;

import java.util.List;

public interface CompanyService
{
    List<Company>  findAverageDistance();

    List<Company> findTotalDistance();


}
