package FawrySystem;

import java.util.*;

public class Refund {
    Scanner input = new Scanner(System.in);

    Payment p = new Wallet();
    ServiceFactory s;
    boolean status = true;

    public boolean RefundRequest() {
        System.out.println("Enter ID of the service: ");
        String ID = input.next();
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
        if (status == true) {
            p.availMoney += s.servz.get(id);
        }

        return 0;
    }

}
