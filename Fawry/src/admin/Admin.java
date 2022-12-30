package admin;

import java.util.*;

import refund.Refund;
import services.Services;
 
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
