package com.project.software2.fawry.phase2.services;



public class Schools implements Donations {
    
    String schoolName;
    public Schools(String name) {
 	   this.schoolName=name;
    }

    @Override
    public double donate(double amount) {
        
        // send amount to the school name(schoolName)
        System.out.println("You need to pay: " + amount);
        return amount;
    }

}