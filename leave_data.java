import java.io.*;

class leave_data {
    final String file_name="leave_data.csv";
    int id = 0;
    int leave_type = 0;

    leave_data(int id, int type) {
        this.id = id;
        this.leave_type = type;
    }
    leave_data(){

    }
    
    public void  leave(int id,int leave_type) throws IOException {
        PrintWriter pw=new PrintWriter(new FileWriter(file_name,true));
        StringBuilder sb=new StringBuilder();
        sb.append(id);
        if(leave_type==0){
//         defaulting that the number of leaves is 100 for faculty member;
           
            sb.append(100);
            pw.write(sb.toString());
            pw.write("\n");
            pw.flush();
            pw.close();
        }

    }
    public void show(int id) throws IOException{
        BufferedReader read=new BufferedReader(new FileReader(file_name));
        String line=null;
        int f=0;
        while((line=read.readLine())!=null){
            String [] arr=line.split(",");
            if(Integer.parseInt(arr[0])==id){
                for(int i=1;i<arr.length;i++)
                   System.out.print(arr[i]+"|");
                System.out.print("");
                f=1;
            }
        }
        if (f==0)
            System.out.println("Member with given id is not found");
    }
    public boolean is_approved(int id,int duration) throws IOException{
        BufferedReader read=new BufferedReader(new FileReader(file_name));
        String line=null;
        while((line=read.readLine())!=null){
            String [] arr=line.split(",");
            if(Integer.parseInt(arr[0])==id){
            if(duration<Integer.parseInt(arr[1])){
                return true;
            }
            }
        }
        return false;
    }
}

