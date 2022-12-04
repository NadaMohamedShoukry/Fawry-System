package FawrySystem;

import java.util.Scanner;

public class Schools implements Donations {
    Scanner input = new Scanner(System.in);

    @Override
    public double donate(double amount) {
        System.out.println("Enter School Name: ");
        String name = input.next();
        // send amount to the school name
        System.out.println("You need to pay: " + amount);
        return amount;
    }

}
