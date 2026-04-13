package week2_xu_mingcheng.pracitice3;

public class FullTimeEmployee extends Employee implements SalaryCalculatable {

    private int monthlySalary;

    public FullTimeEmployee(String name, int monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int calculateSalary() {
        return monthlySalary;
    }
}