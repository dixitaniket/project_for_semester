import java.util.Scanner;
class login extends login_details {
    admin add=null;
    faculty fac=null;
    public void input_taker_admin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter -1 for go back");
        System.out.println("enter id");
        int id =scan.nextInt();
        if (id==-1)
        {
            String[] str={"kamle","saini","aere"};
            entry.main(str);
        }
        scan.nextLine();
        System.out.println("enter pass");
        String pass = scan.nextLine();
        if (pass.equals("-1"))
        {
            String[] str={"kamle","saini","aere"};
            entry.main(str);
        }
        try{log_id(id,pass);}
        catch(Exception e)
        {
            System.out.println("Error to open login_details_admin");
        }
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
