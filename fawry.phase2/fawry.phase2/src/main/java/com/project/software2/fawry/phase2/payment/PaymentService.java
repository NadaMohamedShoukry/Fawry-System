package com.project.software2.fawry.phase2.payment;

import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Service
public class PaymentService {
	Payment obj;
    double cost;
    boolean check=false;
    // @PostMapping(value="/check/{costt}")
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
    // @PostMapping(value="/paymentway")
    public void setStrategy( Payment obj) {
   	 this.obj=obj;
    }
}
