package FawrySystem;

import java.util.*;

public class Refund {
    Scanner input = new Scanner(System.in);

    Wallet p = new Wallet();
    ServiceFactory s;
    boolean status = true;
    

    public boolean RefundRequest() {
        System.out.println("Enter ID of the service: ");
        int ID = input.nextInt();
        
        // send refund request to admin
        System.out.println("your refund request is sent to the admin.");
        if (status == true) {
            System.out.println("your refund request has been accepted.");
            return true;
        } else {
            System.out.println("your refund request has been rejected.");
            return false;
        }
    }


    public double getMoney() {
        if (status == true) 
        {
            p.availMoney += s.servs.get(s.servID);
            
        }
        System.out.println(p.availMoney);
        return p.availMoney;
    }

}
