import java.util.Scanner;
public class admin extends member_details {
    admin() {
        show_admin();
    }
    public void show_admin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Home page\n2. Add member\n3. Delete member\n4. See pending leave request\n5. See member info");
        switch (scan.nextInt())
        {
            case 1:
                String str[]={"kamal","saini"};
                entry.main(str);
            case 2:
               try{add_member();
                   System.out.println("\n~~Adding member is sucessfull~~\n");
                    show_admin();
                   } 
               catch(Exception e){
                     System.out.println("problem in opening files,please try again later");
                }
                break;
            case 3:
                try {
                    scan.nextLine();
                    System.out.println("Enter id of member");
                    String s=scan.nextLine();
                    if (!dequeue(s,"member.csv")||!dequeue(s,"login_details_fac.csv"))
                        System.out.println("\n~~Member with given id not exits~~\n");
                    else   
                        System.out.println("\n~~Deleting a member is sucessfull~~\n");
                    show_admin();
                } catch (Exception e) {
                    System.out.println("error occured");
                }
                break;

            case 4:
                try{pending_leave_request();
                      System.out.println("");
                     show_admin();}
                catch(Exception e)
                {
                    System.out.println("Problem in opening leave_data server");
                }
                break;
            case 5:
                try {
                    scan.nextLine();
                    System.out.println("Enter id");
                    String s=scan.nextLine();
                    member_info(Integer.parseInt(s));
                    System.out.println("");
                    show_admin();
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
