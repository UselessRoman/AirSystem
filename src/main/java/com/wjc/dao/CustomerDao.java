package com.wjc.dao;


import com.wjc.domain.Customer;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao {

    //根据姓名查询信息
    @Select("select  customer.customerName, Customer.customerID,Customer.phoneNum,Customer.ticketNum,ticket.flightID,Price,Discount,startPlace ,Destination,startTime " +
            "from customer,ticket,flight " +
            "where  Customer.customerName=#{name} and customer.ticketNum=Ticket.ticketID and ticket.flightID=Flight.flightId")
    List<Customer> searchAllInformationByName(String name);


    //根据id查询信息
    @Select("select Customer.* from Customer ,ticket,flight " +
            "where  Customer.customerID = #{id} and   Ticket.flightID=Flight.flightId and " +
            "  Customer.ticketNum=Ticket.ticketID ")
    Customer findByID(int id);


    @Select("select customer.* ,Price,t.flightID,Discount,startPlace ,Destination,startTime " +
            " from customer join ticket t on t.ticketID = customer.ticketNum join flight f on f.flightId = t.flightID" +
            " where destination=#{destination}" +
            " and customerID like '__________________' ")
    List<Customer> findByMainlandIDAndDestination(String destination);


}
