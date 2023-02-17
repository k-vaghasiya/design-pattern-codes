public class Main {
    public static void main(String[] args) {
        Collage clg = new Builder().setName("Daiict").setRank(2).setFees(190000).setCity("Gandhinagar").getCollage();
        System.out.println(clg.toString());
    }
}