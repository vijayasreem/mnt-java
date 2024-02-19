package com.sales.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sales.demo.model.Customer;
import com.sales.demo.service.CustomerService;

@RestController
@RequestMapping("/sales/demo")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    
    @RequestMapping(value="/captureCustomerDemographicData", method=RequestMethod.POST)
    public Customer captureCustomerDemographicData(String customerName, int age, String gender, String address) {
        return customerService.captureCustomerDemographicData(customerName, age, gender, address);
    }
    
    @RequestMapping(value="/captureFamilyIncomeDetails", method=RequestMethod.POST)
    public ResponseEntity<?> captureFamilyIncomeDetails(int familyIncome, int numberOfDependents) {
        if (familyIncome < 0 || numberOfDependents < 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Family income and number of dependents must be non-negative.");
        }
        
        return ResponseEntity.ok(customerService.captureFamilyIncomeDetails(familyIncome, numberOfDependents));
    }
    
    @RequestMapping(value="/captureCRIFScore", method=RequestMethod.POST)
    public Customer captureCRIFScore(int crifScore) {
        return customerService.captureCRIFScore(crifScore);
    }
    
    @RequestMapping(value="/validateCustomerData", method=RequestMethod.POST)
    public Customer validateCustomerData(String customerName, int age, String gender, String address, int familyIncome, int numberOfDependents, int crifScore) {
        return customerService.validateCustomerData(customerName, age, gender, address, familyIncome, numberOfDependents, crifScore);
    }
    
    @RequestMapping(value="/generateOTPForAuthentication", method=RequestMethod.POST)
    public Customer generateOTPForAuthentication(String OTP) {
        return customerService.generateOTPForAuthentication(OTP);
    }
    
    @RequestMapping(value="/calculateHLVBasedOnCRIFScore", method=RequestMethod.POST)
    public Customer calculateHLVBasedOnCRIFScore(int crifScore, int HLV) {
        return customerService.calculateHLVBasedOnCRIFScore(crifScore, HLV);
    }
    
    @RequestMapping(value="/selectPolicyTenureAndSumAssuredRange", method=RequestMethod.POST)
    public Customer selectPolicyTenureAndSumAssuredRange(int policyTenure, int sumAssured) {
        return customerService.selectPolicyTenureAndSumAssuredRange(policyTenure, sumAssured);
    }
    
    @RequestMapping(value="/checkEligibilityForInsuranceBasedOnAnnualIncome", method=RequestMethod.POST)
    public Customer checkEligibilityForInsuranceBasedOnAnnualIncome(int annualIncome, boolean eligibility) {
        return customerService.checkEligibilityForInsuranceBasedOnAnnualIncome(annualIncome, eligibility);
    }
    
    @RequestMapping(value="/generateCOIForSuccessfulPolicyIssuance", method=RequestMethod.POST)
    public Customer generateCOIForSuccessfulPolicyIssuance(String COI) {
        return customerService.generateCOIForSuccessfulPolicyIssuance(COI);
    }
    
}