public class LocalTracking implements Train {

    String location = "LocTrain:Rajkot";
    void setLocation(String loc){
        this.location = loc;
    }

    @Override
    public void getLocationLocal() {
        System.out.println("Your Local Train is currently at location : " + location );
    }

    @Override
    public void getLocationExpress() {
        //
    }
}
