//import tablesaw.io.csv.*;
import java.lang.String;
import java.io.*;
class Leave_server
{
    final String leave="leave_server.csv";
    public void  train(){
//        Cs    }

    public  void enqueue(String str) throws IOException
    {
        FileWriter fw=new FileWriter(leave,true);
        PrintWriter pw=new PrintWriter(fw);
        String str_arr[] =str.split(",");
        for(int i=0;i<str_arr.length;i++)
        {
            pw.print(str_arr[i]);
            pw.print(",");
        }
        pw.println("");
        pw.flush();
        pw.close();
    }
    public  void dequeue() throws IOException
    {
        BufferedReader bf=new BufferedReader(new FileReader(leave));
        String line=bf.readLine();
        line=bf.readLine();
        int max_size=10;
        String str_arr[]=new String[10];
        int size=0;
        while(line!=null)
        {
            str_arr[size]=line;
            size++;
            if (size==max_size)
            {
                str_arr=double_length(str_arr,size);
                max_size=2*max_size;
            } 
            line=bf.readLine();
        }
        FileWriter fw=new FileWriter("leave");
        PrintWriter pw=new PrintWriter(fw);
        pw.print("hello");
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

    public void  show()throws IOException{
        BufferedReader bf=new BufferedReader(new FileReader(leave));
        String line=bf.readLine();
        String[] l=line.split(",");
        int i=0;
        while(i<l.length){
            System.out.println(l[i]);
            i++;
        }
    }

    public void leave_approval_status(boolean x,int id,int duration){
        if(x){
//            kamlesh function which changes the data for the files

        }
        else{
//            nothing happens.
        }
    }

}