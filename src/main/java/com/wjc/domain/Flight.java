package com.wjc.domain;

import java.util.Date;

public class Flight {

    private int flightId;
    private String flightName;
    private String startPlace;
    private String destination;
    private Date startTime;
    private Date arriveTime;
    private int distance;
    private int companyID;
    private int passengerNum;
    private int totalSale;

    @Override
    public String toString() {
        return "航班标识为" + flightId +
                "的" + flightName  +
                "号航班，由" + startPlace  +
                "起飞，降落至" + destination  +
                ", 出发时间为" + startTime +
                ", 到达时间为" + arriveTime +
                ", 航程" + distance +
                ", 公司标识为" + companyID +
                ", 乘客总人数" + passengerNum +
                ", 总销售额为" + totalSale;
    }

    public int getPassengerNum() {
        return passengerNum;
    }

    public void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;
    }

    public int getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(int totalSale) {
        this.totalSale = totalSale;
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
