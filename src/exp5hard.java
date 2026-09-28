import java.io.*;
import java.util.*;

public class exp5hard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Employee ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Designation: ");
                String designation = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                try {
                    FileWriter fw = new FileWriter("employees.txt", true);

                    fw.write("Name: " + name + "\n");
                    fw.write("ID: " + id + "\n");
                    fw.write("Designation: " + designation + "\n");
                    fw.write("Salary: " + salary + "\n");
                    fw.write("----------------------\n");

                    fw.close();

                    System.out.println("Employee added successfully.");

                } catch (IOException e) {
                    System.out.println("Error: " + e);
                }

            } else if (choice == 2) {

                try {
                    FileReader fr = new FileReader("employees.txt");
                    Scanner file = new Scanner(fr);

                    System.out.println("\nEmployee Details:");

                    while (file.hasNextLine()) {
                        System.out.println(file.nextLine());
                    }

                    file.close();
                    fr.close();

                } catch (FileNotFoundException e) {
                    System.out.println("No employee records found.");
                } catch (IOException e) {
                    System.out.println("Error: " + e);
                }

            } else if (choice == 3) {

                System.out.println("Program exited.");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}