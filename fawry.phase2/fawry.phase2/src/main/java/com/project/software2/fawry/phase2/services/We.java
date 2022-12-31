package com.project.software2.fawry.phase2.services;


public class We implements MobileRecharge, InternetPayment {
	
    String intNumber;
    String mobNumber;

    @Override
    public double recharge(double amount) {
        // send number and amount to the company to charge(mobNumber)
        System.out.println("You need to pay: " + (amount * 1.5));
        return (amount * 1.5);
    }

    @Override
    public double internetPay(double amount) {
        
        // send number and amount to the company to Pay for internet(mobNumber)
        System.out.println("You need to pay: " + amount);
        return amount;
    }
    
    @Override
    public void setInternetNumb(String number) {
    	this.intNumber=number;
    }
    
    @Override
    public void setMobileNumb(String number) {
    	this.mobNumber=number;
    }

}
