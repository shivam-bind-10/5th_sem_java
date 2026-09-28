
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Salary: " + salary);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. Display Employees");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                // Add
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new Employee(id, name, salary));

                    System.out.println("Employee added successfully.");
                    break;

                // Update
                case 2:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();

                    boolean updated = false;

                    for (Employee e : employees) {
                        if (e.id == updateId) {

                            sc.nextLine();

                            System.out.print("Enter new Name: ");
                            e.name = sc.nextLine();

                            System.out.print("Enter new Salary: ");
                            e.salary = sc.nextDouble();

                            System.out.println("Employee updated successfully.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee not found.");
                    }
                    break;

                // Remove
                case 3:
                    System.out.print("Enter ID to remove: ");
                    int removeId = sc.nextInt();

                    boolean removed = false;

                    for (Employee e : employees) {
                        if (e.id == removeId) {
                            employees.remove(e);

                            System.out.println("Employee removed successfully.");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Employee not found.");
                    }
                    break;

                // Search
                case 4:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Employee e : employees) {
                        if (e.id == searchId) {
                            System.out.println("Employee found:");
                            e.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                // Display
                case 5:
                    if (employees.isEmpty()) {
                        System.out.println("No employees available.");
                    } else {
                        System.out.println("\nEmployee Details:");

                        for (Employee e : employees) {
                            e.display();
                        }
                    }
                    break;

                // Exit
                case 6:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
