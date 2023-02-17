class BusStation {
    private static BusStation obj;
    private BusStation(){
        //
    }

    public static BusStation getInstance(){
        if ( obj == null ) {
            obj = new BusStation();
            System.out.println(obj);
            return obj;
        }
        else {
            System.out.println(obj);
            return obj;
        }
    }
}

class Main {
    public static void main(String[] args) {
        BusStation b1 = BusStation.getInstance();
        BusStation b2 = BusStation.getInstance();
    }
}