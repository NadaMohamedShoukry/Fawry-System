package fawry;

import java.util.*;

public class Refund {
	 Scanner input = new Scanner(System.in);

	    //Wallet p = new Wallet(10000);
	    ServiceFactory s;
	    boolean status;
	    
	    Admin a = new Admin();

	    public boolean RefundRequest() {
	        System.out.println("Enter ID of the service: ");
	        int ID = input.nextInt();
	        a.refundRequests.add(ID);
	       // s.servID =ID;
	        System.out.println("your refund request is sent to the admin.");
	        if (status == true) {
	            System.out.println("your refund request has been accepted.");
	            return true;
	        } else {
	            System.out.println("your refund request has been rejected.");
	            return false;
	        }
	    }

	    public void setStatus(boolean st) {
	    	status = st;
	    }

	    public double getMoney() {
	        if (status == true) 
	        {
	           // p.availMoney += s.servs.get(s.servID);
	        	return s.servs.get(s.servID);
	            
	        }
	        //System.out.println(p.availMoney);
	        return 0.0;
	    }

}
