package Staff;

public class Employee {

    private String name;
    private String nINumber;
    protected double salary;
    protected int bonus;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != null) {
            this.name = newName;
        }
    }

    public String getNINumber() {
        return nINumber;
    }

    public int getSalary() {
        return (int)salary;
    }

    public void raiseSalary(Double raise){
        if (raise >=0) {
            this.salary += raise;
        }
        }

    public int payBonus(){
        return bonus = (int)(this.salary * 0.01);
    }
}
