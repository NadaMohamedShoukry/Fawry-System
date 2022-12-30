package refund;


import admin.Admin;
import payment.*;
import services.ServiceFactory;

public class Refund {

	    Wallet w = new Wallet();
	    ServiceFactory s;
	    //boolean status;
	    
	    Admin a = new Admin();

	    public boolean RefundRequest(int ID) {
	    	//Refund f = new Refund();
	        //System.out.println("Enter ID of the service: ");
	        a.refundRequests.add(ID);
	        System.out.println("your refund request is sent to the admin.");
	        if (a.status == true) {
	            System.out.println("your refund request has been accepted.");
	            return true;
	        } else {
	            System.out.println("your refund request has been rejected.");
	            return false;
	        }
	    }

//	    public void setStatus(boolean st) {
//	    	status = st;s
//	    }

	    public double getMoney() {
	        if (a.status == true) 
	        {
	           w.availMoney += ServiceFactory.servs.get(ServiceFactory.servID);
	        	return ServiceFactory.servs.get(ServiceFactory.servID);
	            
	        }
	        return w.availMoney;
	    }

}
