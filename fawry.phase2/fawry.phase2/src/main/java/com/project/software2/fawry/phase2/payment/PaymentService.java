package com.project.software2.fawry.phase2.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentService {
	Payment obj;
    double cost;
    boolean check=false;
     @GetMapping(value="/check/{costt}")
    public String ProcessOrder( @PathVariable ("costt") double cost1) {
   	 if(obj.validatePay()) {
   		 obj.pay(cost);
   		 //System.out.print("You Paid "+ cost);
   		 check=true;
   	 }
   	 if(check) {
   		 return ("You Paid "+ cost);
   	 }
   	 return "Not Allowed";
    }
    
    public void setStrategy(Payment obj) {
   	 this.obj=obj;
    }
}
