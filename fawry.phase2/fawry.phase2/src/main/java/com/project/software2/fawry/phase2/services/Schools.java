package com.project.software2.fawry.phase2.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Schools implements Donations {
    
    String schoolName;
    public void setName(String name) {
		   this.schoolName=name;
	   }
	   
	   public String getName()
	   {
		   return schoolName;
	   }
    @PostMapping(value="/schooldonate/{amount}")
    @Override
    public double donate(@PathVariable("amount")double amount) {
        
        // send amount to the school name(schoolName)
        System.out.println("You need to pay: " + amount);
        return amount;
    }

}