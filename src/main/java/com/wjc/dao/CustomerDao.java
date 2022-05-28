package com.wjc.dao;


import com.wjc.domain.Customer;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao {

    //根据姓名查询信息
    @Select("select  customer.customerName, Customer.customerID,Customer.phoneNum,Customer.ticketNum,Price,Discount,startPlace ,Destination,startTime " +
            "from customer,ticket,flight " +
            "where  Customer.customerName=#{name} and customer.ticketNum=Ticket.ticketID and ticket.flightID=Flight.flightId")
    Customer searchAllInformationByName(String name);

    @Select("select Customer.* from Customer ,ticket,flight " +
            "where  Customer.customerID = #{id} and   Ticket.flightID=Flight.flightId and " +
            "  Customer.ticketNum=Ticket.ticketID ")
    void findByID(int id);

}
