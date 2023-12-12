package com.sales.demo.model;

public class DocVerification {
    private String identity;
    private String address;
    private int income;
    private int creditScore;

    public DocVerification(String identity, String address, int income, int creditScore) {
        this.identity = identity;
        this.address = address;
        this.income = income;
        this.creditScore = creditScore;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}