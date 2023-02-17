public class ExpressTracking implements Train {

    String location = "ExpTrain:Rajkot";
    void setLocation(String loc){
        this.location = loc;
    }

    @Override
    public void getLocationLocal() {
       //
    }

    @Override
    public void getLocationExpress() {
        System.out.println("Your Express Train is currently at location : " + location );
    }
}
