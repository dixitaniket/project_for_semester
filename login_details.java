import java.io.BufferedReader;
import java.io.FileReader;

public class login_details {
//    private Integer[] id=new Integer[100];
//    private String[] name=new String[100];
    private final String login_details="/home/aniket/IdeaProjects/project_for_semester/src/login_details.csv";
    private int id_admin=12345;
    private String password="iiitv";
    private String pass_fac="iiitv";
    private int fac=12345;
    public void log_id(int i,String pass){
        if(i==id_admin && pass.equals(pass_fac)){
           admin add=new admin();

        }
        else{
            System.out.println("wrong credentials");
            return;
        }
    }

//format csv file "id","password";
      public void load_details_fac(int id,String password){
        try {
            BufferedReader br=new BufferedReader(new FileReader(login_details));
        String line=null;
        int flag=0;
            while ((line=br.readLine())!=null) {
                String[] a = line.split(",");
                if (Integer.parseInt(a[0]) == id && a[1].equals(password)) {
                    flag=1;
                    faculty fac=new faculty(id);
                }
            }
            if(flag==0){
                System.out.println("no faculty with this id found");
            }

            return;

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
