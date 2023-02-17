import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Welcome Messages
        System.out.println("Welcome TO KV Train Service Portal");
        System.out.println("Please Create Your Account , Enter your name : ");

        // Inputing for Username
        Scanner userNameInput = new Scanner(System.in);
        String userName = userNameInput.nextLine();

        // Using factory 's factory to get new User
        User user = new FactoryFactory().getFactory("user").getUser(userName);


        Train express = null;
        Train luxury = null;

        boolean cFlag = false;

        do {

            // Which Train user want to book
            System.out.println("Booking Choices : Express(1) or Luxury(2) ");
            int flag = -1;
            Scanner sc = new Scanner(System.in);
            flag = sc.nextInt();

            // For booking Luxury Train
            if (flag == 1) {
                FactoryFactory ff = new FactoryFactory();
                Factory bf = (trainFactory) ff.getFactory("Train");
                express = (Train) bf.getTrain("express");

                System.out.println("Train booked Successfully");
                user.bookedTrainType += "express";

                // print details of Train , user
                System.out.println(" 1) User Details 2) Train Details");
                Scanner getDetailsInput = new Scanner(System.in);
                int getDetails = getDetailsInput.nextInt();

                if (getDetails == 1) {
                    user.getInfo();
                } else if (getDetails == 2) {
                    express.getDetails();
                }

            }

            // For booking Local Train
            else if (flag == 2) {
                FactoryFactory ff = new FactoryFactory();
                Factory bf = (trainFactory) ff.getFactory("Train");
                luxury = (Train) bf.getTrain("luxury");

                System.out.println("Train booked Successfully");
                user.bookedTrainType += " luxury ";

                // print details of Train , user
                System.out.println(" 1) User Details 2) Train Details");
                Scanner getDetailsInput = new Scanner(System.in);
                int getDetails = getDetailsInput.nextInt();

                if (getDetails == 1) {
                    user.getInfo();
                } else if (getDetails == 2) {
                    luxury.getDetails();
                }
            }

            else {

            }

            // For running KV Train portal again and again
            System.out.println(" 0 for close application 1 for continue ");
            Scanner cFlagg = new Scanner(System.in);

            int cFlaggg = cFlagg.nextInt();

            if ( cFlaggg == 1 ) {
                cFlag = true;
            }
            else {
                cFlag = false;
            }

        } while ( cFlag == true );
    }
}