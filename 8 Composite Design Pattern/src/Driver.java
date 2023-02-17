public class Driver implements  Employee {
    private String name;
    private long empId;
    private String position;

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId+" " +name);
    }

    public Driver (long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

}
