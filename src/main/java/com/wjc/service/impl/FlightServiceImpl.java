package com.wjc.service.impl;

import com.wjc.dao.FlightDao;
import com.wjc.domain.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wjc.service.FlightService;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService
{
    @Autowired
    private FlightDao flightDao;

    @Override
    public void count() {
        flightDao.count();
    }

    @Override
    public List<Flight> findByStartCity(String city) {
        return flightDao.findByStartCity(city);
    }

    @Override
    public List<Flight> findByDestinationCity(String city) {
        return flightDao.findByDestinationCity(city);
    }

    @Override
    public List<Flight> indByStartAndDestination(String start,String destination) {
        return flightDao.findByStartAndDestination(start,destination);
    }
}
