package com.project.software2.fawry.phase2.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuarterReceipt implements Landline {
	
    String landNumber; 
    public void setName(String name) {
		   this.landNumber=name;
	   }
	   
	   public String getName()
	   {
		   return landNumber;
	   }
	   
	   @PostMapping(value="/quarterreceipt/{amount}")
    @Override
    public double payReceipt(@PathVariable("amount")double amount) {    
        // send number and amount to the company to Pay for internet(landNumber)
        System.out.println("You need to pay: " + amount * 3);
        return amount * 3;
    }

}
