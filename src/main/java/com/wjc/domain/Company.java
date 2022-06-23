package com.wjc.domain;

public class Company {
    private int companyID;

    private String companyName;

    private int totalDistance;

    private int averageDistance;

    private int totalPassenager;

    private int totalSale;

    public int getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    public int getAverageDistance() {
        return averageDistance;
    }

    public int getTotalPassenager() {
        return totalPassenager;
    }

    public void setTotalPassenage(int totalPassenage) {
        this.totalPassenager = totalPassenage;
    }

    public int getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(int totalSale) {
        this.totalSale = totalSale;
    }

    @Override
    public String toString() {
        String line = "标号为" + companyID +
                "的航司, 全称为" + companyName;
        if (totalDistance != 0) line += ",总运营里程为" + totalDistance;
        if (averageDistance != 0) line += ",平均运营里程为" + averageDistance;
        if (totalPassenager != 0) line += ",总人数为" + totalPassenager;
        if (totalSale != 0) line += ",总销售额为" + totalSale;

        return line;
    }

    public void setAverageDistance(int averageDistance) {
        this.averageDistance = averageDistance;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
