package com.wjc.dao;


import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao {
    @Select("select  customer.customerName, Customer.customerID,Customer.phoneNum,Customer.ticketNum,Price,Discount,salesmanID,startPlace ,Destination,startTime " +
            "from customer,ticket,flight " +
            "where  Customer.customerName=${name} and customer.ticketNum=Ticket.ticketID and ticket.flightID=Flight.flightId")
    void searchAllInformationByName(String name);

    @Select("select Customer.* from Customer ,ticket,flight " +
            "where  Customer.customerID = #{id} and   Ticket.flightID=Flight.flightId and " +
            "  Customer.ticketNum=Ticket.ticketID ")
    void findByID(int id);

}
