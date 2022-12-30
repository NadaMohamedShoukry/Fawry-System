package fawry;

import java.util.Scanner;

import payment.Cache;
import payment.CreditCard;
import payment.OverallDiscount;
import payment.Payment;
import payment.PaymentService;
import payment.Wallet;
import services.*;
import user.SignIn;
import user.SignUp;
import user.User;


public class Main {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to Our System");
		User user = new User();
		System.out.println("1:SignIn / 2:SignUp ");
		int choice = input.nextInt();
		if(choice==1)
		{
			SignIn si = new SignIn();
			System.out.println("Enter Username:");
			String userName=input.next();
			user.setName(userName);
			System.out.println("Enter Password:");
			String password=input.next();
			user.setPass(password);
			si.login(user);
			if(si.check==false) {
				SignUp su = new SignUp();
				System.out.println("Enter Username:");
				 userName=input.next();
				user.setName(userName);
				System.out.println("Enter Email:");
				String email=input.next();
				user.setEmail(email);
				System.out.println("Enter Password:");
				 password=input.next();
				user.setPass(password);
				su.login(user);
			}
				
		}
		else
		{
			SignUp su = new SignUp();
			System.out.println("Enter Username:");
			String userName=input.next();
			user.setName(userName);
			System.out.println("Enter Email:");
			String email=input.next();
			user.setEmail(email);
			System.out.println("Enter Password:");
			String password=input.next();
			user.setPass(password);
			su.login(user);
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

		        System.out.println("Enter mobile number: ");
		        String number = input.next();
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
				rm.setMobileNumb(number);

		        System.out.println("Enter recharge amount: ");
		        double amount = input.nextDouble();
				 cost=s.payForMobile(rm,amount);
				
				
			}else if(ch=='B' || ch=='b') {
				InternetPayment ip= new We(); // as a default 
				
				System.out.println("\nChoose Service Provider:");
				System.out.println("1:Vodafone");
				System.out.println("2:Orange");
				System.out.println("3:We");
				System.out.println("4:Etisalat");
				int num = input.nextInt();
				System.out.println("Enter Landline number used to internet: ");
		        String number = input.next();
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

		        System.out.println("Enter Internet fee: ");
		        double amount = input.nextDouble();
				ip.setInternetNumb(number);
				 cost=s.payForInternet(ip,amount);
				
			}else if(ch=='C' || ch=='c') {
				Landline ln=new MonthlyReceipt(""); // as a default 
				
				System.out.println("\nChoose Service Provider:");
				System.out.println("1: Monthly Receipt");
				System.out.println("2: Quarter Receipt");
				int num = input.nextInt();
				System.out.println("Enter Landline number:");
		        String number = input.next();
				switch (num) {
					case 1:
						ln=new MonthlyReceipt(number);
						break;
					case 2:
						ln=new QuarterReceipt(number);
						break;
				} 

		    	System.out.println("Enter Landline fee per month: ");
		        double amount = input.nextDouble();
				cost = s.payForLandline(ln,amount);
				
			}else if(ch=='D' || ch=='d') {
				Donations d=new Schools("");// as a default 
				System.out.println("\nChoose Service Provider:");
				System.out.println("1: Cancer Hospital");
				System.out.println("2: Schools");
				System.out.println("3: NGOs");
				int num = input.nextInt();
				String name ;
				switch (num) {
					case 1:
					   System.out.println("Enter Hospital Name: ");
					    name = input.next();
						d = new CancerHospital(name);
						break;
					case 2:
						System.out.println("Enter School Name: ");
				         name = input.next();
						d = new Schools(name);
						break;
					case 3:
						 System.out.println("Enter NGO (organizations) Name: ");
					      name = input.next();
						d = new NGOs(name);
						break;
				}
				System.out.println("Enter Donation's amount: ");
		         double amount = input.nextDouble();
				cost = s.payForDonations(d,amount);
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
					System.out.println("Enter verfy message");
			 		String verfyNum=input.next();
					p = new Wallet(mn,verfyNum);
					break;
				case 2:
					System.out.println("Enter Available Money in the Credit");
					 mn=input.nextDouble();
					 System.out.println("Enter Card No.:");
					input = new Scanner(System.in);
					String cardnumber=input.next();
					System.out.println("Enter Month:");
					input = new Scanner(System.in);
					int Month=input.nextInt();
					System.out.println("Enter Year:");
					input = new Scanner(System.in);
					int Year=input.nextInt();
					System.out.println("Enter Price:");
					double amount=input.nextDouble();
					p = new CreditCard(cardnumber,Month,Year,mn,amount);
					break;
				case 3:
					System.out.println("Enter the Address");
					String address=input.next();
					System.out.println("Enter Phone Number");
					String number=input.next();
					System.out.println("Enter amount to be paid");
					double cachemoney=input.nextDouble();
					p = new Cache(cachemoney,address,number);
					break;
			}

			//p.collectPayDet();
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
