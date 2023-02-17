// >>>>>>>>>>>>>>>>>>>>>>>> Class Train >>>>>>>>>>>>>>>>>>>>>
class Train {

    private String route;
    private String trainNumber;
    private int availability;

    private Train(TrainBuilder builder) {
        this.route = builder.route;

        this.trainNumber = builder.trainNumber;
        this.availability = builder.availability;

    }

    public void displayRoute() {
        System.out.println("Train route: " + route);
    }

    public void displayTrainNumber() {
        System.out.println("Train number: " + trainNumber);
    }

    public void displayAvailability() {
        System.out.println("Train availability: " + availability);
    }

    // >>>>>>>>>>>>>>> Train builder >>>>>>>>>>>>>>>>>>>.

    public static class TrainBuilder {
        private String route;
        private String trainNumber;
        private int availability;

        public TrainBuilder(String route) {
            this.route = route;
        }

        public TrainBuilder trainNumber(String trainNumber) {
            this.trainNumber = trainNumber;
            return this;
        }

        public TrainBuilder availability(int availability) {
            this.availability = availability;
            return this;
        }

        public Train build() {
            return new Train(this);
        }

    }

}

// >>>>>>>>>>>>>>>>>>>> Class Main >>>>>>>>>>>>>>>>>>>>>>>>>>>>

public class bMain {
    public static void main(String[] args) {

        Train express = new Train.TrainBuilder("Delhi to Mumbai").trainNumber("253").availability(45).build();
        express.displayRoute();
        express.displayTrainNumber();
        express.displayAvailability();

        Train passenger = new Train.TrainBuilder("Delhi to Kolkata").trainNumber("764").availability(23).build();

        passenger.displayRoute();
        passenger.displayTrainNumber();
        passenger.displayAvailability();

    }

}
