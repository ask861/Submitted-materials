package week2_xu_mingcheng.pracitice3;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
            new FullTimeEmployee("田中", 300000),
            new PartTimeEmployee("佐藤", 1200, 80),
            new PartTimeEmployee("鈴木", 1000, 60)
        };

        for (Employee employee : employees) {
            SalaryCalculatable sc = (SalaryCalculatable) employee;
            System.out.println(employee.getName() + " の給与: " + sc.calculateSalary() + "円");
        }
    }
}