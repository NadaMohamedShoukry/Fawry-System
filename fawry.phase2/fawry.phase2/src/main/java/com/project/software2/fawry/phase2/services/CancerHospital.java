package com.project.software2.fawry.phase2.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CancerHospital  implements Donations {
    
	   String hosptName;
	   public void setName(String name) {
		   this.hosptName=name;
	   }
	   
	   public String getName()
	   {
		   return hosptName;
	   }
	   
	   @PostMapping(value="/hosdonate/{amount}")
	    @Override
	    public double donate(@PathVariable("amount")double amount) {
	        // send amount to the hospital name (hosptName)
	        System.out.println("You need to pay: " + amount);
	        return amount;
	    }
	}
