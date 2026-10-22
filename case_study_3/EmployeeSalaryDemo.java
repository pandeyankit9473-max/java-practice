import java.util.ArrayList;
import java.util.Scanner;

class EmployeeSalary {

    ArrayList<Integer> salaries = new ArrayList<>();

    void addSalary(int salary) {
        salaries.add(salary);
    }

    void calculateBonus() {

        for (int salary : salaries) {

            double bonus;

            if (salary >= 80000) {
                bonus = salary * 0.15;
            } else if (salary >= 50000) {
                bonus = salary * 0.10;
            } else if (salary >= 30000) {
                bonus = salary * 0.05;
            } else {
                bonus = 0;
            }

            double revisedSalary = salary + bonus;

            System.out.println("Salary: " + salary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Revised Salary: " + revisedSalary);
        }
    }
}

public class EmployeeSalaryDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeSalary e = new EmployeeSalary();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary: ");
            int salary = sc.nextInt();
            e.addSalary(salary);
        }

        e.calculateBonus();
    }
}