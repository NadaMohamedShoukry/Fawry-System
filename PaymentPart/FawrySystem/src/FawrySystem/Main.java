package FawrySystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
		double money=in.nextDouble();
		PaymentService obj=new PaymentService();
		Payment obj2=new CreditCard(name,money);
		obj.setStrategy(obj2);
		obj.ProcessOrder(obj2.pay(50.0));
		obj2.account(50.0);
	    
	   
		
		

	}

}
