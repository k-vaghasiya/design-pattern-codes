import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
    public class Journey implements JourneyPrototype{

        String jName;
        ArrayList<Location> journey = new ArrayList<Location>();


        // >>>>>>>> Getters and setters >>>>>>>>>

        // (1) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        public String getjName() {
            return jName;
        }
        // (2) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        public ArrayList<Location> getJourney() {
            return journey;
        }
        // (3) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        public void setJourney() {

            System.out.println("Enter the location you want to add ");
            HashMap<Integer , String> map = new HashMap<>();
            map.put(1,"Somnath");
            map.put(2,"Junagadh");
            map.put(3,"Jetpur");
            map.put(4,"Rajkot");
            map.put(5,"Amdavad");
            map.put(6,"Jaipur");
            map.put(7,"Delhi");
            map.put(8,"Manali");

            for ( int i = 0 ; i < 8 ; i++ ){
                System.out.println( i + "  " + map.get(i) );
            }

            System.out.println("How many Location you want to include in this Journey ??");
            Scanner sc = new Scanner(System.in);
            int numofLoc = sc.nextInt();

            for ( int i = 1 ; i <= numofLoc ; i++ ) {
                int keyForMap = sc.nextInt();
                journey.add(new Location (  map.get(keyForMap) ) );
            }

            System.out.println("Location added succesfully");

        }

        // (4) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        public void setrName(String rName) {
            this.jName = rName;
        }




        // >>>>> Constructors >>>>>>
        public Journey() {
            this.jName = "";
        }
        public Journey(String name) {
            this.jName = name;
        }


        // Clone method
        public Journey clone(String journey2 ) {
            Journey j = new Journey( journey2 );
            j.journey = this.journey;
            return j;
        }

        // To String
        public void printJourney() {
            System.out.println("Journey name is : " + jName );
            String text = "";
            for ( int i = 0 ; i < journey.size() ; i++ ) {
                text += " " + journey.get(i).locName + " -> ";
            }
            System.out.println(text);
        }

    }



