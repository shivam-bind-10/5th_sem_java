import java.util.Scanner;
public class exp3_medium {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double balance = 100000;

            try {
                System.out.println("Enter withdrawal amount:");
                double amount = sc.nextDouble();

                if (amount <= 0) {
                    throw new IllegalArgumentException("Invalid withdrawal amount!");
                }

                if (amount > balance) {
                    throw new IllegalArgumentException("Insufficient balance!");
                }

                balance = balance - amount;

                System.out.println("Withdrawal successful!");
                System.out.println("Remaining balance = " + balance);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            sc.close();
        }
    }

