package com.project.software2.fawry.phase2.payment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecialDiscount extends Discount{
	double overAll;
	//Services s;
//    public SpecialDiscount(Payment obj) {
// 	   super.obj=obj;
//    }
    @PostMapping(value="/paymentwayspecial")
    public void paymentway(@RequestBody Payment obj ) {
    	super.obj=obj;
    }
    
    @PostMapping(value="/specialdiscount/{amount}")
    public double pay(@PathVariable("amount")double amount) {
    		overAll = obj.pay(amount);
    		overAll =overAll-((overAll/100)*20.0);
    	return overAll;
    }

}
