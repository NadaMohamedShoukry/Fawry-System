package com.project.software2.fawry.phase2.payment;

public interface Payment {
	public double pay(double amount);
    //public void collectPayDet();
    public boolean validatePay();
    public String account(double amount);
}
