package com.sales.demo.repository;

import java.util.Scanner;

public interface DocVerificationRepository {
    void verifyDocs();

    default void openApp(){
        System.out.println("Welcome to the app!");
    }

    default void verifyIdentityAndAddress(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your identity details:");

        String identity = scanner.nextLine();
        System.out.println("Please enter your address:");

        String address = scanner.nextLine();

        if(identity.equals(address)){
            System.out.println("Identity and address verified. You are eligible for banking services!");
        } else {
            System.out.println("Document verification is incomplete. You are not eligible for banking services.");
        }
    }

    default void verifyIncomeAndCreditScore(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your annual income:");

        int income = scanner.nextInt();
        System.out.println("Please enter your credit score:");

        int creditScore = scanner.nextInt();

        if(income >= 30000 && creditScore >= 700){
            System.out.println("Congratulations! You are eligible for a high limit credit score!");
        } else if(income >= 20000 && creditScore >= 600){
            System.out.println("You are eligible for a moderate limit credit score!");
        }
    }

    default void closeApp(){
        System.out.println("Thank you for using the app. Closing now...");
    }

}