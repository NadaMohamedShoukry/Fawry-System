package com.project.software2.fawry.phase2.services;



public class NGOs implements Donations {
	   
	String orgName;
    public NGOs(String name) {
 	   this.orgName=name;
    }

    @Override
    public double donate(double amount) {
       
        // send amount to the organizations name (orgName)
        System.out.println("You need to pay: " + amount);
        return amount;
    }


}
