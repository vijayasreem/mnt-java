package com.sales.demo.repository;

import java.util.Scanner;

public interface DocVerificationRepository {
    void verifyDocs();

    default void openApp(){
        System.out.println("Welcome to the app!");
    }

    default void verifyIdentityAndAddress(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name:");
        String name = scanner.nextLine();
        
        System.out.println("Please enter your Pan number:");
        String panNumber = scanner.nextLine();
        
        System.out.println("Please enter your address:");
        String address = scanner.nextLine();

        // Assuming that the user details are stored in a database
        // and can be fetched using a method getUserDetails(String name, String panNumber)
        UserDetails userDetails = getUserDetails(name, panNumber);

        if(userDetails != null && userDetails.getAddress().equals(address)){
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
    
    // Assuming that this method fetches the user details from the database
    private UserDetails getUserDetails(String name, String panNumber) {
        // Fetch the user details from the database using the provided name and panNumber
        // Return the UserDetails object if found, else return null
    }
}

class UserDetails {
    private String name;
    private String panNumber;
    private String address;

    public UserDetails(String name, String panNumber, String address) {
        this.name = name;
        this.panNumber = panNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public String getAddress() {
        return address;
    }
}