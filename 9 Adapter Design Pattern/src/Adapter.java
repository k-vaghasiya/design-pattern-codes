import java.util.Scanner;

public class Adapter implements Bus {
    Train TrainTracker;

    public Adapter ( String TrainType ) {
        if ( TrainType.equalsIgnoreCase("local")){
            TrainTracker = new LocalTracking();
        }else if ( TrainType.equalsIgnoreCase("express")){
            TrainTracker = new ExpressTracking();
        }else {
            System.out.println("Enter Valid Train type");
        }
    }

    @Override
    public void getLocation() {

        String train_type;
        System.out.println("Enter the type of train : ");
        Scanner sc = new Scanner(System.in);
        train_type = sc.nextLine();


        if ( train_type.equalsIgnoreCase("local")){
            TrainTracker.getLocationLocal();
        }else if ( train_type.equalsIgnoreCase("express")){
            TrainTracker.getLocationExpress();
        }else {
            System.out.println("Enter Valid Train type");
        }
    }
}
