import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

class leave_forward extends Leave_server {


    public void forward(int id,int leave_type,int duration) {
        if (holiday_validate(id, leave_type, duration)) {
            try {
                enqueue(id + "," + leave_type + "," + duration);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    private boolean holiday_validate(int id,int leave_type,int duration) {
        try {
            BufferedReader bf=new BufferedReader(new FileReader("leave_data.csv"));
            String line = null;
            while ((line = bf.readLine()) != null) {
                String[] arr = line.split(",");
                if (Integer.parseInt(arr[0]) == id) {
                    if (Integer.parseInt(arr[leave_type]) > duration) {
//                        System.out.println("nachooooooooooooooooooooo");
//                        validation is working here for intial validation
                        return true;

                    } else {
                        return false;
                    }
                }
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;
    }



}
