package com.project.software2.fawry.phase2.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Service
public class Services implements ServiceFactory {
    
	//@PostMapping(value="/payDonations/{amount}")
    @Override
    public double payForDonations(Donations d, double amount) {
    	 
         double cost = d.donate(amount);
         // servID++;
         servs.add(cost); // to help in refund method
         System.out.println("the service ID is:" + servs.lastIndexOf(cost));
         return cost;
    }
    
	//@PostMapping(value="/payInternet/{amount}")
    @Override
    public double payForInternet(InternetPayment i, double amount) {
        double cost = i.internetPay(amount);
        // servID++;
        servs.add(cost); // to help in refund method
        System.out.println("the service ID is:" + servs.lastIndexOf(cost));
        return cost;
    }
    
	//@PostMapping(value="/payLandline/{amount}")
    @Override
    public double payForLandline( Landline l, double amount) {
        double cost = l.payReceipt(amount);
        // servID++;
        servs.add(cost); // to help in refund method
        System.out.println("the service ID is:" + servs.lastIndexOf(cost));
        return cost;
    }
    
	//@PostMapping(value="/payMobile/{amount}")
    @Override
    public double payForMobile( MobileRecharge m,  double amount) {
        double cost = m.recharge(amount);
        // servID++;
        servs.add(cost); // to help in refund method
        System.out.println("the service ID is:" + servs.lastIndexOf(cost));
        return cost;
        // p.pay(amount); //we will call it later after coding it

    }


}
