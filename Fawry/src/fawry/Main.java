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
		boolean f=true;
		while(f) {
			System.out.println("\n\n ===========\n");
			System.out.println("Choose a Service:");
			System.out.println("A: Mobile Recharge");
			System.out.println("B: Internet Payment");
			System.out.println("C: Landline");
			System.out.println("D: Donations");
			System.out.println("E: EXIST");
			char ch = input.next().charAt(0);
			ServiceFactory s=new Services();
			Payment p= new CreditCard(15000);
			PaymentService ps= new PaymentService();
			double cost=0.0;
			if(ch=='A' || ch=='a') {
				MobileRecharge rm= new We(); // as a default 
	
				System.out.println("\nChoose Service Provider:");
				System.out.println("1: Vodafone");
				System.out.println("2: Orange");
				System.out.println("3: We");
				System.out.println("4: Etisalat");
				int num = input.nextInt();
				switch (num) {
					case 1:
						rm = new Vodafone();
						break;
					case 2:
						rm = new Orange();
						break;
					case 3:
						rm = new We();
						break;
					case 4:
						rm = new Etisalat();
						break;
					
				}
				 cost=s.payForMobile(rm);
				
				
			}else if(ch=='B' || ch=='b') {
				InternetPayment ip= new We(); // as a default 
				
				System.out.println("\nChoose Service Provider:");
				System.out.println("1:Vodafone");
				System.out.println("2:Orange");
				System.out.println("3:We");
				System.out.println("4:Etisalat");
				int num = input.nextInt();
				switch (num) {
					case 1:
						ip = new Vodafone();
						break;
					case 2:
						ip = new Orange();
						break;
					case 3:
						ip = new We();
						break;
					case 4:
						ip = new Etisalat();
						break;
					
				}
				 cost=s.payForInternet(ip);
				
			}else if(ch=='C' || ch=='c') {
				Landline ln=new MonthlyReceipt(); // as a default 
				
				System.out.println("\nChoose Service Provider:");
				System.out.println("1: Monthly Receipt");
				System.out.println("2: Quarter Receipt");
				int num = input.nextInt();
				switch (num) {
					case 1:
						ln=new MonthlyReceipt();
						break;
					case 2:
						ln=new QuarterReceipt();
						break;
				} 
				cost = s.payForLandline(ln);
				
			}else if(ch=='D' || ch=='d') {
				Donations d=new Schools();// as a default 
				System.out.println("\nChoose Service Provider:");
				System.out.println("1: Cancer Hospital");
				System.out.println("2: Schools");
				System.out.println("3: NGOs");
				int num = input.nextInt();
				switch (num) {
					case 1:
						d = new CancerHospital();
						break;
					case 2:
						d = new Schools();
						break;
					case 3:
						d = new NGOs();
						break;
				}
				cost = s.payForDonations(d);
			}else if(ch=='E' || ch=='e') {
				System.out.println("EXIST");
				f=false;
				break;
			}
			
			System.out.println("\nChoose Payment Way:");
			System.out.println("1: Wallet");
			System.out.println("2: Credit Card");
			System.out.println("3: Cache");
			int num = input.nextInt();
			switch (num) {
				
				case 1:
					System.out.println("Enter Available Money in your Wallet");
					double mn=input.nextDouble();
					p = new Wallet(mn);
					break;
				case 2:
					System.out.println("Enter Available Money in the Credit");
					 mn=input.nextDouble();
					p = new CreditCard(mn);
					break;
				case 3:
					p = new Cache();
					break;
			}

			p.collectPayDet();
			ps.setStrategy(p);
			if(s.servs.lastIndexOf(cost)==0) {
				p=new OverallDiscount(p);
				System.out.println("As it's your 1st service we make a discount for you");
				cost=p.pay(cost);
			}
			
			ps.ProcessOrder(cost);
			p.account(cost);
			
			
		}	
	
	}
}
