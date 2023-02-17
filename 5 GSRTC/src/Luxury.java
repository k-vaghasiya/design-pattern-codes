class Luxury implements Train {
    public String TrainNumber = "lux";
    static int TrainCount = 0;
    // for updating Train number whenever new local Train object create
    Luxury(){
        TrainNumber = TrainNumber + TrainCount;
        TrainCount++;
    }
    private String route[] = new String[]{"Somnath", "Jetpur","Rajkot","Ahmedabad","Gandhinagar"};
    private String TrainSrc = route[0];
    private String TrainDestination = route[ route.length - 1 ];
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
        System.out.println("Train : " + TrainNumber );
        System.out.println("Train : " + TrainNumber );
        System.out.println("Train source : " + TrainSrc );
        System.out.println("Train destination : " + TrainDestination );
        System.out.println("Train currLocation : " + route[currLocationIndex] );
    }
}
