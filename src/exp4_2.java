import java.util.ArrayList;
import java.util.Scanner;

public class exp4_2 {





        static class Employee {
            int id;
            String name;
            double salary;

            Employee(int id, String name, double salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
            }

            public String toString() {
                return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
            }
        }

        static ArrayList<Employee> employees = new ArrayList<>();

        static Employee findEmployee(int id) {
            for (Employee employee : employees) {
                if (employee.id == id) {
                    return employee;
                }
            }
            return null;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n--- Employee Management ---");
                System.out.println("1. Add employee");
                System.out.println("2. Update employee");
                System.out.println("3. Remove employee");
                System.out.println("4. Search employee");
                System.out.println("5. Display all employees");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        if (findEmployee(id) != null) {
                            System.out.println("Employee ID already exists.");
                            break;
                        }
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter salary: ");
                        double salary = scanner.nextDouble();
                        employees.add(new Employee(id, name, salary));
                        System.out.println("Employee added.");
                        break;

                    case 2:
                        System.out.print("Enter ID to update: ");
                        id = scanner.nextInt();
                        scanner.nextLine();
                        Employee employee = findEmployee(id);
                        if (employee == null) {
                            System.out.println("Employee not found.");
                        } else {
                            System.out.print("Enter new name: ");
                            employee.name = scanner.nextLine();
                            System.out.print("Enter new salary: ");
                            employee.salary = scanner.nextDouble();
                            System.out.println("Employee updated.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter ID to remove: ");
                        id = scanner.nextInt();
                        employee = findEmployee(id);
                        if (employee == null) {
                            System.out.println("Employee not found.");
                        } else {
                            employees.remove(employee);
                            System.out.println("Employee removed.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter ID to search: ");
                        id = scanner.nextInt();
                        employee = findEmployee(id);
                        System.out.println(employee == null ? "Employee not found." : employee);
                        break;

                    case 5:
                        if (employees.isEmpty()) {
                            System.out.println("No employees found.");
                        } else {
                            for (Employee item : employees) {
                                System.out.println(item);
                            }
                        }
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 6);

            scanner.close();
        }
    }



