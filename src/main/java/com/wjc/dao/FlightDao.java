package com.wjc.dao;


import com.wjc.domain.Flight;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightDao {

    //统计所有航班数量
    @Select("select count(*) from Flight")
    void count();


    //查询从某城市起飞的所有航班
    @Select("select  * from Flight where startPlace=#{city}")
    List<Flight> findByStartCity(String city);


    //查询降落在某城市的所有航班
    @Select("select * from Flight where destination=#{city}")
    List<Flight> findByDestinationCity(String city);


    //查询在某城市起飞在某城市降落的航班
    @Select("select * from Flight " +
            "where destination=#{destination} and startPlace=#{start} " +
            "order by startTime ")
    List<Flight> findByStartAndDestination(String start, String destination);


    //统计各航班的人数和销售额，按照航班人数和销售额升序
    @Select("select Flight.*, COUNT(*) as passengerNum, sum(price * Discount) as totalSale " +
            "from flight join ticket join customer " +
            "where Flight.flightId=Ticket.FlightId AND Customer.ticketNum=Ticket.ticketID " +
            "group by Flight.flightId " +
            "order by passengerNum,totalSale;")
    List<Flight> findPassengerNumAndTotalSale();


    @Select("select distinct * from Flight join ticket " +
            "where destination=#{destination} and startPlace=#{start} " +
            "and ticket.discount = " +
            "(select min(discount*price)" +
            "from ticket join flight " +
            "where  destination = #{destination} and startPlace=#{start})")
    Flight findCheapestByStartAndDestination(String start, String destination);


}
