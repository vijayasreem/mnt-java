package com.sales.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.demo.model.Customer;
import com.sales.demo.repository.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;
    
    public Customer captureCustomerDemographicData(String customerName, int age, String gender, String address) {
        return customerRepository.findByCustomerNameAndAgeAndGenderAndAddress(customerName, age, gender, address);
    }
    
    public Customer captureFamilyIncomeDetails(int familyIncome, int numberOfDependents) {
        return customerRepository.findByFamilyIncomeAndNumberOfDependents(familyIncome, numberOfDependents);
    }
    
    public Customer captureCRIFScore(int crifScore) {
        return customerRepository.findByCrifScore(crifScore);
    }
    
    public Customer validateCustomerData(String customerName, int age, String gender, String address, int familyIncome, int numberOfDependents, int crifScore) {
        return customerRepository.findByCustomerNameAndAgeAndGenderAndAddressAndFamilyIncomeAndNumberOfDependentsAndCrifScore(customerName, age, gender, address, familyIncome, numberOfDependents, crifScore);
    }
    
    public Customer generateOTPForAuthentication(String OTP) {
        return customerRepository.findByOTP(OTP);
    }
    
    public Customer calculateHLVBasedOnCRIFScore(int crifScore, int HLV) {
        return customerRepository.findByCrifScoreAndHLV(crifScore, HLV);
    }
    
    public Customer selectPolicyTenureAndSumAssuredRange(int policyTenure, int sumAssured) {
        return customerRepository.findByPolicyTenureAndSumAssured(policyTenure, sumAssured);
    }
    
    public Customer checkEligibilityForInsuranceBasedOnAnnualIncome(int annualIncome, boolean eligibility) {
        return customerRepository.findByAnnualIncomeAndEligibility(annualIncome, eligibility);
    }
    
    public Customer generateCOIForSuccessfulPolicyIssuance(String COI) {
        return customerRepository.findByCOI(COI);
    }
}