package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private int age;
    private String gender;
    private String address;
    private int familyIncome;
    private int numberOfDependents;
    private int crifScore;
    private String OTP;
    private int HLV;
    private int policyTenure;
    private int sumAssured;
    private int annualIncome;
    private boolean eligibility;
    private String COI;
    
    public Customer() {
    }
    
    public Customer(String customerName, int age, String gender, String address, int familyIncome, int numberOfDependents, int crifScore, String OTP, int HLV, int policyTenure, int sumAssured, int annualIncome, boolean eligibility, String COI) {
        this.customerName = customerName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.familyIncome = familyIncome;
        this.numberOfDependents = numberOfDependents;
        this.crifScore = crifScore;
        this.OTP = OTP;
        this.HLV = HLV;
        this.policyTenure = policyTenure;
        this.sumAssured = sumAssured;
        this.annualIncome = annualIncome;
        this.eligibility = eligibility;
        this.COI = COI;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getFamilyIncome() {
        return familyIncome;
    }
    
    public void setFamilyIncome(int familyIncome) {
        this.familyIncome = familyIncome;
    }
    
    public int getNumberOfDependents() {
        return numberOfDependents;
    }
    
    public void setNumberOfDependents(int numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }
    
    public int getCrifScore() {
        return crifScore;
    }
    
    public void setCrifScore(int crifScore) {
        this.crifScore = crifScore;
    }
    
    public String getOTP() {
        return OTP;
    }
    
    public void setOTP(String OTP) {
        this.OTP = OTP;
    }
    
    public int getHLV() {
        return HLV;
    }
    
    public void setHLV(int HLV) {
        this.HLV = HLV;
    }
    
    public int getPolicyTenure() {
        return policyTenure;
    }
    
    public void setPolicyTenure(int policyTenure) {
        this.policyTenure = policyTenure;
    }
    
    public int getSumAssured() {
        return sumAssured;
    }
    
    public void setSumAssured(int sumAssured) {
        this.sumAssured = sum