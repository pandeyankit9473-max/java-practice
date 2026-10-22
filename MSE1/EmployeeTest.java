class Employee {
    private String name;
    private int id;
    private double salary;
    private String department;

    static int employeeCount = 0;

    final static String companyName = "Tech Solutions";

    Employee(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        employeeCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 101, 45000, "IT");
        Employee e2 = new Employee("Neha", 102, 55000, "HR");

        System.out.println(e1.getName());
        System.out.println("Salary: " + e2.getSalary());
        System.out.println("Company: " + Employee.companyName);
        System.out.println("Total Employees: " + Employee.employeeCount);
    }
}