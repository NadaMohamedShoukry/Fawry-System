package com.project.software2.fawry.phase2.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NGOs implements Donations {
	   
	String orgName;
	public void setName(String name) {
		   this.orgName=name;
	   }
	   
	   public String getName()
	   {
		   return orgName;
	   }
      
    @PostMapping(value="/ngodonate/{amount}")
    @Override
    public double donate(@PathVariable("amount")double amount) {
       
        // send amount to the organizations name (orgName)
        System.out.println("You need to pay: " + amount);
        return amount;
    }


}
