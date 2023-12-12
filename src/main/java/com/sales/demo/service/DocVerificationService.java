package com.sales.demo.service;

import com.sales.demo.repository.DocVerificationRepository;

public class DocVerificationService implements DocVerificationRepository {

    @Override
    public void verifyDocs() {
        openApp();
        verifyIdentityAndAddress();
        verifyIncomeAndCreditScore();
        closeApp();
    }
}