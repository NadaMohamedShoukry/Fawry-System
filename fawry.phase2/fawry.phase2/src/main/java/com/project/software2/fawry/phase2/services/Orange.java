package com.project.software2.fawry.phase2.services;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Orange  implements MobileRecharge, InternetPayment {
    String intNumber;
    String mobNumber;
    
    @PostMapping(value="/orangeMobile/{amount}")
    @Override
    public double recharge(@PathVariable("amount")double amount) {
    	
        // send number and amount to the company to charge money (mobNumber)
        System.out.println("You need to pay: " + (amount * 1.5));
        return (amount * 1.5);
    }
    
    @PostMapping(value="/orangeInternet/{amount}")
    @Override
    public double internetPay(@PathVariable("amount")double amount) {
        // send number and amount to the company to Pay for Internet (intNumber)
        System.out.println("You need to pay: " + amount);
        return amount;
    }
    
    @Override
    public void setInternetNumb(String number) {
    	this.intNumber=number;
    }
    
    @Override
    public String getMobileNumb() {
    	return mobNumber;
    }
    
    public String getInternetNumb() {
    	return intNumber;
    }
    
    @Override
    public void setMobileNumb(String number) {
    	this.mobNumber=number;
    }


}