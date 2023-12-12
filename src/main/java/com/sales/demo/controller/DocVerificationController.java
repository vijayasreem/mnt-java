package com.sales.demo.controller;

import com.sales.demo.model.DocVerification;
import com.sales.demo.service.DocVerificationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocVerificationController {

    private DocVerificationService docVerificationService;

    public DocVerificationController(DocVerificationService docVerificationService) {
        this.docVerificationService = docVerificationService;
    }

    @PostMapping("/verifyDocs")
    public void verifyDocs(@RequestBody DocVerification docVerification) {
        docVerificationService.verifyDocs();
    }
}