package com.wjc.dao;


import com.wjc.domain.Company;
import com.wjc.domain.Flight;
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


    @Select("select companyName,AVG(distance) as averageDistance " +
            "from flight join company " +
            "where company.companyID=Flight.companyID " +
            "group by companyName " +
            "having AVG(distance)>#{distance};")
    List<Company> findAverageDistanceMoreThan(int distance);



    @Select("select company.Companyname,Flight.flightId , COUNT(*) as totalPassenger , SUM(Price*discount) as totalSale " +
            "from flight join company join Ticket join customer " +
            "where Flight.flightId=Ticket.flightID and Ticket.ticketID = Customer.ticketNum and  company.companyID=Flight.Companyid " +
            "group by Companyname " +
            "order by totalPassenger,totalSale ")
    List<Company> findTotalPassengerAndTotalSale();






}
