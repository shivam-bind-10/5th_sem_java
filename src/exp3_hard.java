import java.util.Scanner;
public class exp3_hard {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║       🎓 UNIVERSITY ENROLMENT 🎓     ║");
            System.out.println("╚══════════════════════════════════════╝");

            try {
                System.out.print("\nEnter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Student Age: ");
                int age = sc.nextInt();

                if (age < 17) {
                    throw new IllegalArgumentException(
                            "❌ Student must be at least 17 years old."
                    );
                }

                sc.nextLine(); // consume newline

                System.out.println("\nAvailable Courses:");
                System.out.println("1. Computer Science");
                System.out.println("2. Information Technology");
                System.out.println("3. Electronics");
                System.out.println("4. Mechanical Engineering");

                System.out.print("\nSelect Course (1-4): ");
                int choice = sc.nextInt();

                String course;

                switch (choice) {
                    case 1:
                        course = "Computer Science";
                        break;

                    case 2:
                        course = "Information Technology";
                        break;

                    case 3:
                        course = "Electronics";
                        break;

                    case 4:
                        course = "Mechanical Engineering";
                        break;

                    default:
                        throw new IllegalArgumentException(
                                "❌ Invalid course selection!"
                        );
                }

                System.out.println("\n╔══════════════════════════════════════╗");
                System.out.println("║        ✅ ENROLMENT SUCCESSFUL       ║");
                System.out.println("╠══════════════════════════════════════╣");
                System.out.println("║ Student Name : " + name);
                System.out.println("║ Age          : " + age);
                System.out.println("║ Course       : " + course);
                System.out.println("╚══════════════════════════════════════╝");

            } catch (java.util.InputMismatchException e) {

                System.out.println("\n❌ Invalid input!");
                System.out.println("Please enter the correct type of value.");

            } catch (IllegalArgumentException e) {

                System.out.println("\n" + e.getMessage());

            } finally {

                System.out.println("\nThank you for using University Enrolment System 🎓");
                sc.close();
            }
        }
    }

