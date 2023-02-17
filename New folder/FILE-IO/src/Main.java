import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            BufferedWriter writer = new BufferedWriter( new FileWriter( "kv.txt") );
            writer.write("Hey there I am kv");
            writer.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader reader = new BufferedReader( new FileReader ( "kv.txt "));
            String s = reader.readLine();
            reader.close();
            System.out.printf(s + " !!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}