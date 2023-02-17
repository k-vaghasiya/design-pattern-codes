public class InquiryDepEmployees implements Employee {
    private String name;
    private long empId;
    private String position;

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId+" " +name);
    }

    public InquiryDepEmployees (long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }
}
