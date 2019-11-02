import java.util.Scanner;
public class entry{
public static void main(String[] args){

    Scanner scan=new Scanner(System.in);
    login log=new login();
    System.out.println("1>> admin");
    System.out.println("2>> faculty");
    int choice=scan.nextInt();
    if(choice==1){
//        System.out.println("\033[H\033[2J");
        System.out.println("-------------------------------------------------");
        log.input_taker_admin();
    }
    else{
        log.input_taker_faculty();
    }

}

}
