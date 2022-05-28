package com.wjc.domain;

public class Ticket {
    private int ticketID;
    private int flightID;
    private int price;
    private double discount;
    private int salesmanID;
    private boolean isSold;
    private String level;

    @Override
    public String toString() {
        String information = "票号为" + ticketID + "的"+level+"票，航班标识为" + flightID + ", 价格为" + price + ", 折扣为" + discount * 100 + "%,";
        if (isSold) information += "已出售，售票员编号为" + salesmanID;
        else information+="未出售";
        return information;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getSalesmanID() {
        return salesmanID;
    }

    public void setSalesmanID(int salesmanID) {
        this.salesmanID = salesmanID;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
