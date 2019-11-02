import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class member_details {
    private final String login_details="login_details.csv";
    final String name="/home/aniket/IdeaProjects/project_for_semester/src/member.csv";
     public boolean add_member(){
        Scanner obj=new Scanner(System.in);

        try{
        PrintWriter pw=new PrintWriter(new FileWriter(name,true));
        StringBuilder sb=new StringBuilder();

        String extra;

        System.out.println("Enter ID : ");
        String id=obj.nextLine();
        sb.append(id);
        sb.append(",");

        System.out.println("Enter Name of faculty : ");
        String name =obj.nextLine();
        sb.append(name);
        sb.append(",");
        
        System.out.println("Enter DOB ( format DD/MM/YYYY) : "  );
        String dob=obj.nextLine();
        sb.append(dob);
        sb.append(",");

//        assumming 0 for faculty and 1 for other staff
        System.out.println("Enter employee category");
        String x=obj.nextLine();
        sb.append(x);
        sb.append(",");


        System.out.println("Gender (M/F) : ");
        char gender=obj.next().charAt(0);
        extra=obj.nextLine();
        sb.append(gender);
        sb.append(",");

        
        System.out.println("Enter Mobile no. : ");
        int mob=obj.nextInt();
        extra=obj.nextLine();
        sb.append(mob);
        sb.append(",");
        
        System.out.println("Enter E-mail : ");
        String email=obj.nextLine();
        sb.append(email);
        sb.append(",");

        pw.write(sb.toString());
        pw.write("\n");
        pw.flush();
        pw.close();
        add_login_fac(Integer.parseInt(id));
        return true;
        
    }catch(Exception e){
        // TODO :handle exception 
//            System.out.println("problem in opening files,please try again later");
            return false;
        }
}


    public  void dequeue(String id) throws IOException
    {
        BufferedReader bf=new BufferedReader(new FileReader(name));
        String line=bf.readLine();
        int max_size=10;
        String str_arr[]=new String[10];
        int size=0;
        while(line!=null)
        {
            String str[]=line.split(",");
            
            if(!str[0].equals(id))
            {
            str_arr[size]=line;
            size++;
            if (size==max_size)
            {
                str_arr=double_length(str_arr,size);
                max_size=2*max_size;
            }
            } 
            line=bf.readLine();
        }
        bf.close();
        FileWriter fw=new FileWriter(name);
        PrintWriter pw=new PrintWriter(fw);
        for(int i=0;i<size;i++)
        {
            String str[]=str_arr[i].split(",");
            for(int j=0;j<str.length;j++)
            {
                if (j==str.length-1)
                   pw.println(str[j]);
                else
                {
                    pw.print(str[j]);
                    pw.print(",");
                }      
            }
        }  
        pw.flush();
        pw.close(); 
    }
    private  String[] double_length(String str[],int len) throws IOException
    {
         String temp[]=new String[2*len];
         for(int i=0;i<len;i++)
            temp[i]=str[i];
        return temp;
    }


    public void member_info(Integer login_id)throws IOException{
        BufferedReader bf=new BufferedReader(new FileReader(name));
        String line=null;
        int flag=0;
        while((line=bf.readLine())!=null){
            String arr[]=line.split(",");
            if(Integer.parseInt(arr[0])==login_id){
                for(int  i=0;i<7;i++){
                    System.out.println(arr[i]);

                }
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("faculty not found");
        }
    }

    public void add_login_fac(int id){
         try {
             Scanner scan=new Scanner(System.in);
             PrintWriter pw=new PrintWriter(new FileWriter(login_details,true));
             StringBuilder sb=new StringBuilder();
             sb.append(id);
             sb.append(",");
             System.out.println("enter pass for id holder");
             sb.append(scan.nextLine());
//             sb.toString();
             pw.write(sb.toString());
             pw.write("\n");
             pw.flush();
             pw.close();



         }
         catch (Exception e){
//             System.out.println("error occured, please try again");;
         }


    }



}
//
//class tester{
//    public static void main(String[] args) {
//        member_details mem = new member_details();
////        mem.add_member();
//        mem.add_member();
//        mem.add_member();
//        try {
//            mem.dequeue("1212");
//        }
//        catch (Exception e){
//            System.out.println("runners");
//        }
//    }
//}