import java.util.Scanner;
//import tablesaw.*;
public class admin extends member_details {
    admin() {
        show_admin();
    }
    public void show_admin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Add member\n2. Delete member\n3. See pending leave request\n4. See member info");
        switch (scan.nextInt()) {
            case 1:
               try{add_member();} 
               catch(Exception e){
              // TODO :handle exception 
                     System.out.println("problem in opening files,please try again later");
                }
                break;
            case 2:
                try {
                    scan.nextLine();
                    System.out.println("Enter id of member");
                    String s=scan.nextLine();
                    dequeue(s);
                } catch (Exception e) {
                    System.out.println("error occured");
                };
                break;

            case 3:

                break;
            case 4:
                try {
                    member_info(Integer.parseInt(scan.nextLine()));
                } catch (Exception e) {
                    System.out.println("error in processing command");
                }

        }
    }

}
class leave_manager extends Leave_server{
    public void get_requests(){
        Scanner scan=new Scanner(System.in);
        Leave_server get=new Leave_server();
        try {
            get.show();
//            approve or disapprovement of leave can only be in like a queue and nothing else

            System.out.println("show leave requests");
            System.out.println("1>>approve leave");
            System.out.println("2>reject leave");
            System.out.println("3>>go back");
            switch (scan.nextInt()){
                case 1:show();
                    break;
                case 2:
                case 3:dequeue();
                break;


            }
        }
        catch (Exception e){
            System.out.println("exception occured");
        }
    }



}
