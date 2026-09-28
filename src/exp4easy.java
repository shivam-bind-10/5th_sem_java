import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void show() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class exp4easy {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Rahul", 30000));
        list.add(new Employee(102, "Aman", 35000));
        list.add(new Employee(103, "Riya", 40000));

        System.out.println("Employees:");

        for (Employee e : list) {
            e.show();
        }

        // Search
        int searchId = 102;

        for (Employee e : list) {
            if (e.id == searchId) {
                System.out.println("\nEmployee Found:");
                e.show();
            }
        }

        // Update
        for (Employee e : list) {
            if (e.id == 102) {
                e.salary = 40000;
            }
        }

        // Remove
        list.removeIf(e -> e.id == 103);

        System.out.println("\nAfter Update and Remove:");

        for (Employee e : list) {
            e.show();
        }
    }
}