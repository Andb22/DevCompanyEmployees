package Staff;

public class Employee {

    private String name;
    private String nINumber;
    private double salary;
    private int bonus;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return nINumber;
    }

    public int getSalary() {
        return (int)salary;
    }

    public void raiseSalary(Double raise){
        this.salary += raise;
    }

    public int payBonus(){
        return bonus = (int)(this.salary * 0.01);
    }
}
