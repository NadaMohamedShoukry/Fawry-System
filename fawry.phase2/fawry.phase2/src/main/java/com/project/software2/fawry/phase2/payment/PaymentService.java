package com.project.software2.fawry.phase2.payment;

import org.springframework.stereotype.Service;


@Service
public class PaymentService {
	Payment obj;
    double cost;
    boolean check=false;
    public String ProcessOrder( double cost) {
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
    public void setStrategy( Payment obj) {
   	 this.obj=obj;
    }
}
