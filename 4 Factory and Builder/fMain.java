// >>>>>>>>>>>>>>>> Interface Train >>>>>>>>>>>>>>>>>>>>>>>>
interface Train
{

  public void displayRoute ();
  public void displayTrainNumber ();
  public void displayAvailability ();

}

// >>>>>>>>>>>>>>>>>>>>>>>> Class ExpressTrain >>>>>>>>>>>>>>>>>>>>>>>>>>.

class ExpressTrain implements Train
{
  private String route;
  private String trainNumber;
  private int availability;


  public ExpressTrain (String route, String trainNumber, int availability)
  {
    this.route = route;

    this.trainNumber = trainNumber;
    this.availability = availability;

  }

  public void displayRoute ()
  {

    System.out.println ("Express train route: " + route);

  }

  public void displayTrainNumber ()
  {

    System.out.println ("Express train number: " + trainNumber);

  }

  public void displayAvailability ()
  {

    System.out.println ("Express train availability: " + availability);
  }

}

// >>>>>>>>>>>>>>>>Class PassengerTrain >>>>>>>>>>>>>>>>>>>

class PassengerTrain implements Train
{
  private String route;
  private String trainNumber;
  private int availability;

  public PassengerTrain (String route, String trainNumber, int availability)
  {
    this.route = route;

    this.trainNumber = trainNumber;
    this.availability = availability;

  }

  public void displayRoute ()
  {

    System.out.println ("Passenger train route: " + route);

  }

  public void displayTrainNumber ()
  {

    System.out.println ("Passenger train number: " + trainNumber);
  }


public void displayAvailability() {  

    System.out.println("Passenger train availability: " + availability);   }  

}   

// >>>>>>>>>>>>>>>>>>> Train Factory >>>>>>>>>>>>>>>>>>>>

class TrainFactory {  

  public Train getTrain(String trainType, String route, String trainNumber, int availability) {  

    if (trainType == null) {       return null;  

    }  

    if (trainType.equalsIgnoreCase("EXPRESS")) {  

      return new ExpressTrain(route, trainNumber, availability);     } else if (trainType.equalsIgnoreCase("PASSENGER")) {  

      return new PassengerTrain(route, trainNumber, availability);  

    }  

    return null;  

  }  

}  

// >>>>>>>>>>>>>>>>>>>>>>>>> Main Class >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

public class fMain {  
    
    public static void main(String[] args) {  

    TrainFactory factory = new TrainFactory();  

      

    //Creating express train object  
    Train express = factory.getTrain("EXPRESS","Delhi to Mumbai", "124", 20);     express.displayRoute();     express.displayTrainNumber();     express.displayAvailability();  

      

    //Creating passenger train object  
    Train passenger = factory.getTrain("PASSENGER","Delhi to Kolkata", "567", 30);     passenger.displayRoute();     passenger.displayTrainNumber();     passenger.displayAvailability();  

  }  

}  
