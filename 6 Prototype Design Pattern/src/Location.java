public class Location {
    public String locName;
    public int x;
    public int y;

    public Location(){
        this.locName = "";
    }

    public Location(String name){
        this.locName = name;
    }

    public Location ( String name , int x , int y ) {
        this.locName = name;
        this.x = x;
        this.y = y;
    }
}
