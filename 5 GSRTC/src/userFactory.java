public class userFactory implements  Factory {
    public  User getUser(String username) {
        return (User) new User(username);
    }

    public Train getTrain(String str) {
        return null;
    }


}
