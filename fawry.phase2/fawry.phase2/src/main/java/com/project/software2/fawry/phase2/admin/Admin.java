package com.project.software2.fawry.phase2.admin;
import java.util.ArrayList;

import com.project.software2.fawry.phase2.refund.Refund;
import com.project.software2.fawry.phase2.services.*;


public class Admin {
	Refund r = new Refund();
	public boolean status;
	public void setStatus(boolean status)
	{
		this.status=status;
	}

    Services serv = new Services();
 
    public ArrayList<Integer> refundRequests = new ArrayList<>();
    {
    for (int i = 0; i < refundRequests.size(); i++) {
		if(status == true);
    	r.getMoney();
	}
    }
}
