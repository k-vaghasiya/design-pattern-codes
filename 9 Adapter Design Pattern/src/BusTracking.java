import java.util.Scanner;

public class BusTracking implements Bus {

    String location = "Bus:Rajkot";
    void setLocation(String loc){
        this.location = loc;
    }

    @Override
    public void getLocation() {
        System.out.println("Your Bus is currently at location : " + location );
    }

}
