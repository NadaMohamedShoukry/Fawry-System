package com.project.software2.fawry.phase2.payment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OverallDiscount extends Discount{
    double overAll;
    
   
//    public OverallDiscount(Payment obj) {
//  	  super.obj=obj;
//    }
   @PostMapping(value="/paymentway/{way}")
    public void paymentway(@PathVariable("way") String obj ) {
    	if(obj=="Wallet")
    		super.obj=new Wallet();
    	else if(obj == "Credit Card")
    		super.obj= new CreditCard();
    	else if(obj == "Cache")
    		super.obj= new Cache();
    }
    @PostMapping(value="/paymentway/{way}/overalldiscount/{amount}")
    public double pay(@PathVariable("amount")double amount) {
    	overAll = obj.pay(amount);
		overAll =overAll-((overAll/100)*10.0);
	return overAll;
    }
   

}
