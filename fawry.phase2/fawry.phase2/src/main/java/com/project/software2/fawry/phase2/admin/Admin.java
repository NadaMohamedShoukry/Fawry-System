package com.project.software2.fawry.phase2.admin;
import java.util.ArrayList;

import com.project.software2.fawry.phase2.payment.Payment;
import com.project.software2.fawry.phase2.payment.Wallet;
import com.project.software2.fawry.phase2.refund.Refund;
import com.project.software2.fawry.phase2.services.*;


public class Admin {
	Refund r = new Refund();
	public boolean status;
	public Transactions obj;
	public void setStatus(boolean status)
	{
		this.status=status;
	}

    Services serv = new Services();
 
    public ArrayList<Refund> refundRequests = new ArrayList<>();

    public ArrayList<Payment> showPaymentTrans() {
//    	for(int i=0; i< obj.paymentTrans.size();i++) {
//    		 System.out.println(obj.paymentTrans.get(i));
//    	}
    	return obj.paymentTrans;
    }
    public ArrayList<Wallet> showWalletTrans() {
//    	for(int i=0; i<  obj.walletTrans.size();i++) {
//		 System.out.println( obj.walletTrans.get(i));
//	}
    	return obj.walletTrans;
    }
    public ArrayList<Refund> showRefundTrans() {
//    	for(int i=0; i< obj.refundTrans.size();i++) {
//		 System.out.println(obj.refundTrans.get(i));
//	}
    	return obj.refundTrans;
    }
    public ArrayList<Refund> showRefundreq() {
//    	for (int i = 0; i < refundRequests.size(); i++) {
//		 System.out.println(refundRequests.get(i));
//	}
    	return refundRequests;
    }
}
