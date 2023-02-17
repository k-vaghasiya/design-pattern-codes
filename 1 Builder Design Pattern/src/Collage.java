public class Collage {
    private String name;
    private int rank;
    private String city;
    private int fees;

    public Collage(String name , int rank , String city , int fees) {
        this.name = name;
        this.rank = rank;
        this.city = city;
        this.fees = fees;
    }

    public String toString(){
        return "Collage name :->" +  this.name + "    Collage NIRF Rank -> : " + this.rank + "     Based on ->" + this.city + " City " + "     Fees :->" + this.fees ;
    }

}

