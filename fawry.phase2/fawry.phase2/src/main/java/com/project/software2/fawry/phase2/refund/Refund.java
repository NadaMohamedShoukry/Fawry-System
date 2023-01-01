
package com.project.software2.fawry.phase2.refund;


import com.project.software2.fawry.phase2.admin.*;
import com.project.software2.fawry.phase2.services.*;

import com.project.software2.fawry.phase2.payment.*;

public class Refund {
    double availMoney;
    String verifyNum;
    Wallet w = new Wallet();
    ServiceFactory s;
    //boolean status;
    
    Admin a = new Admin();

    public boolean RefundRequest(int ID) {
    	//Refund f = new Refund();
        //System.out.println("Enter ID of the service: ");
       // a.refundRequests.add(ID);
        System.out.println("your refund request is sent to the admin.");
        if (a.status == true) {
            System.out.println("your refund request has been accepted.");
            return true;
        } else {
            System.out.println("your refund request has been rejected.");
            return false;
        }
    }

//    public void setStatus(boolean st) {
//    	status = st;s
//    }

    public double getMoney() {
        if (a.status == true) 
        {
           w.availMoney += ServiceFactory.servs.get(ServiceFactory.servID);
        	return ServiceFactory.servs.get(ServiceFactory.servID);
            
        }
        return w.availMoney;
    }

}
