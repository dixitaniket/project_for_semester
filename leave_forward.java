import java.io.IOException;
class leave_forward extends Leave_server {
    public void fetch_data(){
        return ;
    }
    private void check_data(){
        return;
    }
    public  void forward(int id,int leave_type,int duration){
        try {
            enqueue(id + "," + leave_type + "," + duration);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
