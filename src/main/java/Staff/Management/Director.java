package Staff.Management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nINumber, double salary, String deptName, double budget) {
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }

    public int getBudget(){
        return (int)budget;
    }

    @Override
    public int payBonus(){
        return bonus = (int)(super.salary * 0.02);
    }
}
