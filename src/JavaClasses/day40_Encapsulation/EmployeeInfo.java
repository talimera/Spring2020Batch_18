package JavaClasses.day40_Encapsulation;

public class EmployeeInfo {

    private double salary;
    private long SSN;
    private int Id;
    private String address;


    public double getSalary() {
        return salary;
    }

    public long getSSN() {
        return SSN;
    }

    public int getId() {
        return Id;
    }

    public String getAddress(String s) {
        return address;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
