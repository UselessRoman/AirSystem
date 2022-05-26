package com.wjc.dao;


import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDao
{

    @Select("select  company.companyID ,company.companyName ,avg(distance) from Flight,company where flight.companyID=company.companyID  group by company.companyID;")
    void averageTotalDistance();


    @Select("select  company.companyName ,sum(distance)  from flight,company " +
            "where flight.companyID= company.companyID " +
            "group by  Company.companyID")
    int totalDistance();



}
