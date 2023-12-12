package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.demo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
    //method to capture customer demographic data
    Customer findByCustomerNameAndAgeAndGenderAndAddress(String customerName, int age, String gender, String address);
    
    //method to capture family income details
    Customer findByFamilyIncomeAndNumberOfDependents(int familyIncome, int numberOfDependents);
    
    //method to capture CRIF score
    Customer findByCrifScore(int crifScore);
    
    //method to validate customer data
    Customer findByCustomerNameAndAgeAndGenderAndAddressAndFamilyIncomeAndNumberOfDependentsAndCrifScore(String customerName, int age, String gender, String address, int familyIncome, int numberOfDependents, int crifScore);
    
    //method to generate an OTP for authentication
    Customer findByOTP(String OTP);
    
    //method to calculate HLV based on CRIF score
    Customer findByCrifScoreAndHLV(int crifScore, int HLV);
    
    //method to select policy tenure and sum assured range
    Customer findByPolicyTenureAndSumAssured(int policyTenure, int sumAssured);
    
    //method to check eligibility for insurance based on annual income
    Customer findByAnnualIncomeAndEligibility(int annualIncome, boolean eligibility);
    
    //method to generate a COI for successful policy issuance
    Customer findByCOI(String COI);
}