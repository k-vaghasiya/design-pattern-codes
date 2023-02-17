public class Builder {
    private String name;
    private int rank;
    private String city;
    private int fees;

    public Builder setName ( String name ) {
        this.name = name;
        return this;
    }
    public Builder setRank ( int rank ) {
        this.rank = rank;
        return this;
    }
    public Builder setCity ( String city ) {
        this.city = city;
        return this;
    }
    public Builder setFees ( int fees ) {
        this.fees = fees;
        return this;
    }

    public Collage getCollage ( ) {
        return new Collage( name , rank , city , fees );
    }


}
