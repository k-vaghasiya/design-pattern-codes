public class Main
{
    public static void main (String[] args)
    {
        Driver d1 = new Driver(100, "Ram bhai", "Pro Driver");
        Driver d2 = new Driver(101, "Shyam bhai", "noob Driver");
        Directory driverDirectory = new Directory();
        driverDirectory.addEmployee(d1);
        driverDirectory.addEmployee(d2);

        Conductor con1 = new Conductor(200, "Suresh bhai", "day Conductor");
        Conductor man2 = new Conductor(201, "Ramesh bhai ", "night Conductor");

        Directory conDirectory = new Directory();
        conDirectory.addEmployee(con1);
        conDirectory.addEmployee(man2);

        Directory directory = new Directory();
        directory.addEmployee(driverDirectory);
        directory.addEmployee(conDirectory);
        directory.showEmployeeDetails();
    }
}
