package fawry;

public interface Payment {
	public double pay(double amount);
    public double collectPayDet();
    public boolean validatePay();
    public void account(double amount);

}
