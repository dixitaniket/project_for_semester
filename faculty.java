import java.io.IOException;
import java.util.Scanner;

public class faculty extends member_details {
    int fac_id = 0;

    faculty(int id) {
        fac_id = id;
        try {
            show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void show() throws IOException {
        System.out.println("1>see info");
        System.out.println("2>see leaves available");
        System.out.println("3>apply for leave");
        System.out.println("4>change password");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt()) {
            case 1:
                try {
                    member_info(fac_id);
                } catch (Exception e) {
                    System.out.println(e);
                }
                ;
                break;
            case 2:
                leave_data leave = new leave_data();
                leave.show(fac_id);
                break;

            case 3:
                leave_forward lea = new leave_forward();
                System.out.println("Enter leave type 1,2 or 3");
            Scanner scan=new Scanner(System.in);
                int x = scan.nextInt();
                System.out.println("enter duration");
                int y = scan.nextInt();
                lea.forward(fac_id, x, y);
                break;
            case 4:
//            inline data changing password

                break;
            case 5:
                break;

        }
    }
}

