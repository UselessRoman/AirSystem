package com.wjc.domain;

import java.util.Date;

public class Customer {
    private String customerName;
    private String customerID;
    private String phoneNum;
    private int ticketNum;
    private int flightID;
    private String startPlace;
    private String destination;
    private Date startTime;
    private int price;

    @Override
    public String toString() {
        return customerName +
                "乘客，身份证号为'" + customerID +
                ", 电话号码为'" + phoneNum +
                ", 票号为" + ticketNum +
                ", 航班标识为" + flightID +
                ", 由" + startPlace +
                "起飞, 降落至" + destination +
                ", 出发时间为" + startTime +
                ", 票价为" + price;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

}
