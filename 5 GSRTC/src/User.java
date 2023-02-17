class User {

    int userId = 0;
    int staticId = 0;
    String userName;

    public String bookedTrainType = " ";

    public User (){
        //
    }
    public User ( String userName) {
        this.userName = userName;
        this.userId = staticId;
        staticId++;
    }

    public void getInfo ( ) {
        System.out.println("Name : " + userName);
        System.out.println("Userid : " + userId);
        System.out.println("Booked Train : " + bookedTrainType);
    }
}
