import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class EmployeeSalary {

    ArrayList<Integer> salaries = new ArrayList<>();

    void addSalary(int salary) {
        salaries.add(salary);
    }

    void displaySalaries() {
        System.out.println("Salaries: " + salaries);
    }

    void highestSalary() {
        System.out.println("Highest Salary: " + Collections.max(salaries));
    }

    void totalSalary() {
        int total = 0;

        for (int salary : salaries) {
            total = total + salary;
        }

        System.out.println("Total Salary: " + total);
    }

    void averageSalary() {
        int total = 0;

        for (int salary : salaries) {
            total = total + salary;
        }

        double average = (double) total / salaries.size();

        System.out.println("Average Salary: " + average);
    }
}

public class SalaryList {

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

        e.displaySalaries();
        e.highestSalary();
        e.totalSalary();
        e.averageSalary();
    }
}