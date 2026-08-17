import java.util.Scanner;

public class exp3_easy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            System.out.println("Square root = " + Math.sqrt(num));

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}