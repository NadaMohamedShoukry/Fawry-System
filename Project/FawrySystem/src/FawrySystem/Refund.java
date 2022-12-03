package FawrySystem;

import java.util.*;

public class Refund {
    Scanner input = new Scanner(System.in);

    Payment p = new Wallet();
    ServiceFactory s;
    boolean status = true;

    public void RefundRequest() {
        System.out.println("Enter ID of the service: ");
        String ID = input.next();
        // send refund request to admin
        System.out.println("your refund request is send to the admin.");
        if (status == true) {
            System.out.println("your refund request has been accepted.");
        } else {
            System.out.println("your refund request has been rejected.");
        }
    }

    public double getMoney() {
        if (status == true) {
            p.availMoney += s.servz.get(id);
        }

        return 0;
    }

}
