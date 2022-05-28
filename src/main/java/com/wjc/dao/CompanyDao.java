package com.wjc.dao;


import com.wjc.domain.Company;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyDao
{

    //航司的平均里程数
    @Select("select  company.companyID ,company.companyName ,avg(distance) as averageDistance " +
            "from Flight,company " +
            "where flight.companyID=company.companyID  " +
            "group by company.companyID;")
    List<Company> findAverageDistance();



    //航司的总里程数
    @Select("select  company.companyName ,sum(distance) as totalDistance" +
            " from flight,company " +
            "where flight.companyID= company.companyID " +
            "group by  Company.companyID")
    List<Company> findTotalDistance();






}
