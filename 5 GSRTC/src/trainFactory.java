public class trainFactory implements Factory {

    public Train getTrain(String str) {
        if ( str == "express") {
            return (Train) new Express();
        }
        else if ( str == "luxury") {
            return (Train) new Luxury();
        }
        else {
            System.out.println("Enter Valid Object Name ");
            return null;
        }
    }

    public User getUser(String str){
        return (User) null;
    }

}
