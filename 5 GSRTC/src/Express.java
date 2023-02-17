public class Express implements Train{
    public String trainNumber = "exp";
    static int trainCount = 0;
    // for updating train number whenever new local train object create
    Express(){
        trainNumber = trainNumber + trainCount;
        trainCount++;
    }
    private String route[] = new String[]{"Somnath", "Jetpur","Rajkot","Ahmedabad","Gandhinagar"};
    private String trainSrc = route[0];
    private String trainDestination = route[ route.length - 1 ];
    private int currLocationIndex = 0;

    public void updateLocation(String str){
        if ( str == "update") {
            currLocationIndex += 1;
            System.out.println ("Updated Successfully ! Current Location is : " + route[currLocationIndex]);
        }
        else if ( str == "reset" ) {
            currLocationIndex = 0;
            System.out.println ("reseted Successfully ! Current Location is : " + route[currLocationIndex]);
        }

        else {
            System.out.println("Enter valid operation");
        }
    }

    public void getDetails() {
        System.out.println();
        System.out.println("Details:");
        System.out.println("train : " + trainNumber );
        System.out.println("train : " + trainNumber );
        System.out.println("train source : " + trainSrc );
        System.out.println("train destination : " + trainDestination );
        System.out.println("train currLocation : " + route[currLocationIndex] );
    }
}
