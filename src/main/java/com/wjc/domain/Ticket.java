package com.wjc.domain;

public class Ticket
{
    private int ticketID;
    private int flightID;
    private int price;
    private double discount;
    private int salesmanID;
    private boolean isSold;
    private int level;

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketID=" + ticketID +
                ", flightID=" + flightID +
                ", price=" + price +
                ", discount=" + discount +
                ", salesmanID=" + salesmanID +
                ", isSolded=" + isSold +
                ", level=" + level +
                '}';
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
