import java.util.Scanner;

public class Tracker implements Bus{

    Adapter adapter;
    @Override
    public void getLocation() {
        System.out.println("Input Bus or Train For Tracking : ");
        String bus_or_train ;
        Scanner sc = new Scanner(System.in);
        bus_or_train = sc.nextLine();

        if( bus_or_train.equalsIgnoreCase("bus")){
            BusTracking bt = new BusTracking();
            bt.getLocation();
        }

        else if ( bus_or_train.equalsIgnoreCase("localtrain")){
            LocalTracking lt = new LocalTracking();
            lt.getLocationLocal();
        }

        else if ( bus_or_train.equalsIgnoreCase("expresstrain")){
            ExpressTracking et = new ExpressTracking();
            et.getLocationExpress();
        }

        else {
            System.out.println("Enter Valid Bus or Train type ");
        }
    }
}
