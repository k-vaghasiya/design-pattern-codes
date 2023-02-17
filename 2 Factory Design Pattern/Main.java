import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String s_name = s.nextLine();

        Factory f = new Factory();
        Sports S = (Sports) f.Fac(s_name);

        S.about();
    }
}