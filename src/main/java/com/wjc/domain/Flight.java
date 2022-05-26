package com.wjc.domain;

import java.util.Date;

public class Flight
{

    private int flightId;
    private String flightName;
    private String startPlace;
    private String destination;
    private Date startTime;
    private Date arriveTime;
    private int distance;
    private int companyID;

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", flightName='" + flightName + '\'' +
                ", startPlace='" + startPlace + '\'' +
                ", destination='" + destination + '\'' +
                ", startTime=" + startTime +
                ", arriveTime=" + arriveTime +
                ", distance=" + distance +
                ", companyID=" + companyID +
                '}';
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }
}
