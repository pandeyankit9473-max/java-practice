class employee{
    String name;
    double salary;
    employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " +  salary);
    }
}

class Manager extends employee{
    double bonus;
    Manager(String name, double salary, double bonus){
        super(name,salary);
        this.bonus=bonus;
    }
    void dispalymanager(){
        display();
        System.out.println("Bonus: " + bonus);
    }
}


public class Employee {
    public static void main(String[] args){
        Manager m1=new Manager("John", 50000, 10000);
        m1.dispalymanager();
    }
}
