package com.wjc.service;

import com.wjc.domain.Flight;

import java.util.List;

public interface FlightService
{
    void count();

    List<Flight> findByStartCity(String city);

    List<Flight> findByDestinationCity(String city);

    List<Flight> findByStartAndDestination(String start,String destination);

    List<Flight> findPassengerNumAndTotalSale();

    Flight findCheapestByStartAndDestination(String start,String destination);

}
