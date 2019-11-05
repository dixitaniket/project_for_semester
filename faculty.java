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
        System.out.println("1. Go to home page\n2. See info\n3. See leaves avaiability\n4. Apply for leave\n5. Change password");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt())
        {
            case 1:
               String str[]={"kamal","saini"};
               entry.main(str); 
            case 2:
                try {
                    member_info(fac_id);
                    System.out.println("");
                    show();
                } catch (Exception e) {
                    System.out.println("some problem occured"+e);
                }
                break;
            case 3: 
                leave_data leave = new leave_data();
                leave.show(fac_id);
                System.out.println("");
                show();
                break;
            case 4:
                leave_forward lea = new leave_forward();
                System.out.println("Enter leave type");
//            Scanner scan=new Scanner(System.in);
                int x = scan.nextInt();
                System.out.println("enter duration");
                int y = scan.nextInt();
                lea.forward(fac_id, x, y);
                System.out.println("");
                show();
                break;
            case 5:
                scan.nextLine();
                System.out.println("Enter new password");
                change_password(Integer.toString(fac_id) ,scan.nextLine());
                System.out.println("");
                show();
                break;
        }
    }
}

