public class Factory
{
    public Sports Fac(String str)
    {
            if(str.equals("Cricket"))
            {
                return (Sports) new Cricket();
            }
            else if (str.equals("Basketball"))
            {
                return (Sports) new Basketball();
            }
            else if (str.equals("Chess"))
            {
                return (Sports) new Chess();
            }
            else if (str.equals("Volleyball"))
            {
                return (Sports) new Vollyball();
            }

            return null;
    }
}
