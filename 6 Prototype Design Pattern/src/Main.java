public class Main {
    public static void main(String[] args) {

        // Here " Regular-SomnathExpress " and " Luxury-SomnathExpress " Both are diffrent train/bus
        // ... but both follows same path so we can use clone method

        Journey j1 = new Journey("Regular-SomnathExpress");
        j1.setJourney();

        j1.printJourney();

        Journey j2 = j1.clone("Luxury-SomnathExpress");
        j2.printJourney();


    }
}