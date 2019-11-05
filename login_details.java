import java.io.*;
public class login_details {
    private final String login_details="login_details_fac.csv";
    public void log_id(int id,String pass) throws IOException
    {
        BufferedReader bf=new BufferedReader(new FileReader("login_details_admin.csv"));
        String line=bf.readLine();
        int f=0;
        while(line!=null)
        {
            String[] str=line.split(",");
            if ((str[0].equals(Integer.toString(id)))&&(str[1].equals(pass)))
            {
                admin add=new admin();
                f=1;
                break;
            }
            line=bf.readLine();
        }
        if (f==0)
           System.out.println("Wrong credentials");

        bf.close();
    }
      //format csv file "id","password";
      public void load_details_fac(int id,String password){
        try {
            BufferedReader br=new BufferedReader(new FileReader("login_details.csv"));
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
