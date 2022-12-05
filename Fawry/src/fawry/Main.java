package fawry;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to Our System");
		User u1 = new User("" , "" , "");
		System.out.println("1:SignIn / 2:SignUp");
		int choice = input.nextInt();
		if(choice==1)
		{
			SignIn si = new SignIn();
			si.login(u1);
		}
		else
		{
			SignUp su = new SignUp();
			su.login(u1);
		}
		System.out.println("Choose Service Provider:");
		System.out.println("1:Vodafone");
		System.out.println("2:Orange");
		System.out.println("3:We");
		System.out.println("4:Etisalat");
		input = new Scanner(System.in);
		int num = input.nextInt();
		if(num==1)
		{
			Vodafone v = new Vodafone();
			System.out.println("Choose a Server:");
			System.out.println("A:Mobile Recharge");
			System.out.println("B:Internet Payment");
			System.out.println("C:Landline");
			System.out.println("D:Donations");
			input = new Scanner(System.in);
			char ch = input.next().charAt(0);
			if(ch=='A' || ch=='a')
			{
				System.out.println("Enter mobile number:");
				input = new Scanner(System.in);
				String mobnum = input.next();
				System.out.println("Enter amount:");
				input = new Scanner(System.in);
				double Amount = input.nextDouble();
				v.recharge(Amount);
			}
			else if(ch=='B' || ch=='b')
			{
				System.out.println("Enter landline number:");
				input = new Scanner(System.in);
				String landnum = input.next();
				System.out.println("Enter amount:");
				input = new Scanner(System.in);
				double Amount = input.nextDouble();
				v.internetPay(Amount);
			}
			else if(ch=='C' || ch=='c')
			{
				System.out.println("Enter landline number:");
				input = new Scanner(System.in);
				String landnum = input.next();
				System.out.println("Enter amount:");
				input = new Scanner(System.in);
				double Amount = input.nextDouble();
			}
			else if(ch=='D' || ch=='d')
			{
				System.out.println("Enter Foundation:");
				input = new Scanner(System.in);
				String foundation = input.next();
				System.out.println("Enter amount:");
				input = new Scanner(System.in);
				double Amount = input.nextDouble();
				System.out.println("Enter password:");
				input = new Scanner(System.in);
				String pass = input.next();
				System.out.println("Transaction Completed");
			}
		}

//		// the main is not ready only for test what we code
//		Scanner in = new Scanner(System.in);
//		ServiceFactory s = new Services();
//		InternetPayment i = new We();
//		double cost = s.payForInternet(i);
//		// String name = in.nextLine();
//		// double money = in.nextDouble();
//		// PaymentService obj = new PaymentService();
//		// Payment obj2 = new CreditCard(name, money);
//		// obj.setStrategy(obj2);
//		// obj.ProcessOrder(obj2.pay(cost));
//		// obj2.account(50.0);
//		// ServiceFactory ss = new Services();
//		// MobileRecharge m = new Orange();
//		// cost = ss.payForMobile(m);
//		Wallet w = new Wallet(10);
//		//Refund r = new Refund();
//		//r.RefundRequest();
//		//r.getMoney();
//		System.out.println(w.availMoney);
		
	}
}
