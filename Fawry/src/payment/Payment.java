package payment;

public interface Payment {
	public double pay(double amount);
   // public void collectPayDet();
    public boolean validatePay();
    public void account(double amount);

}
