package Staff;

public class Employee {

    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNINumber() {
        return nINumber;
    }

    public void setNINumber(String nINumber) {
        this.nINumber = nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double raise){
        this.salary += raise;
    }

    public void payBonus(){
        double bonus = (this.salary * 0.01);
    }
}
