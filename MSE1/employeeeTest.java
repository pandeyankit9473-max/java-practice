class Employee {
    int calculateBonus() {
        return 5000;
    }
}

class Manager extends Employee {
    int calculateBonus() {
        return 10000;
    }
}

class Developer extends Employee {
    int calculateBonus() {
        return 8000;
    }
}

public class employeeeTest {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();

        System.out.println("Manager Bonus: "
                + e1.calculateBonus());

        System.out.println("Developer Bonus: "
                + e2.calculateBonus());
    }
}