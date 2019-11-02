import java.util.Scanner;

class login extends login_details {
    admin add=null;
    faculty fac=null;
//    login(){
//        add=new admin();
//        fac=new faculty();
//    }
    public void input_taker_admin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter id");
        int id =scan.nextInt();
//        System.out.println(id);
        scan.nextLine();
        System.out.println("enter pass");

        String pass = scan.nextLine();
        log_id(id,pass);


    }

    public void input_taker_faculty() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter id");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("enter pass");
        String pass = scan.nextLine();
        load_details_fac(id,pass);
    }



}
