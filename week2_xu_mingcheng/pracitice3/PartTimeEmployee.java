package week2_xu_mingcheng.pracitice3;

public class PartTimeEmployee extends Employee implements SalaryCalculatable {

    private int hourlyPay;
    private int workingHours;

    public PartTimeEmployee(String name, int hourlyPay, int workingHours) {
        super(name);
        this.hourlyPay = hourlyPay;
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return hourlyPay * workingHours;
    }
}