package com.wjc.dao;


import com.wjc.domain.Flight;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightDao
{

    //统计所有航班数量
    @Select("select count(*) from Flight")
    void count();


    //查询从某城市起飞的所有航班
    @Select("select  * from Flight where startPlace=#{city}")
    List<Flight> findByStartCity(String city);


    //查询降落在某城市的所有航班
    @Select("select * from Flight where destination=#{city}")
    List<Flight> findByDestinationCity(String city);

    @Select("select * from Flight " +
            "where destination=#{destination} and startPlace=#{start} ")
    List<Flight> findByStartAndDestination(String start,String destination);
}
