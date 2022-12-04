package FawrySystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Our System");

		// the main is not ready only for test what we code
		Scanner in = new Scanner(System.in);
		ServiceFactory s = new Services();
		InternetPayment i = new We();
		double cost = s.payForInternet(i);
		// String name = in.nextLine();
		// double money = in.nextDouble();
		// PaymentService obj = new PaymentService();
		// Payment obj2 = new CreditCard(name, money);
		// obj.setStrategy(obj2);
		// obj.ProcessOrder(obj2.pay(cost));
		// obj2.account(50.0);
		// ServiceFactory ss = new Services();
		// MobileRecharge m = new Orange();
		// cost = ss.payForMobile(m);
		Wallet w = new Wallet(10);
		Refund r = new Refund();
		r.RefundRequest();
		r.getMoney();
		System.out.println(w.availMoney);
		
	}
}
