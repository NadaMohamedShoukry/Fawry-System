package payment;

public class PaymentService {
	Payment obj;
    double cost;
    
    public void ProcessOrder(double cost) {
   	 if(obj.validatePay()) {
   		 obj.pay(cost);
   		 System.out.print("You Paid "+ cost);
   	 }
    }
    
    public void setStrategy(Payment obj) {
   	 this.obj=obj;
    }

}
