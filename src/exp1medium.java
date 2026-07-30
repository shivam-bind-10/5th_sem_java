import java.util.Scanner;

public class exp1medium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rows and columns of first matrix: ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        int[][] a = new int[rows1][cols1];
        System.out.println("Enter first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Rows and columns of second matrix: ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();

        int[][] b = new int[rows2][cols2];
        System.out.println("Enter second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        if (rows1 == rows2 && cols1 == cols2) {
            System.out.println("Addition:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print((a[i][j] + b[i][j]) + " ");
                }
                System.out.println();
            }

            System.out.println("Subtraction:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print((a[i][j] - b[i][j]) + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Addition and subtraction need same size matrices.");
        }

        if (cols1 == rows2) {
            System.out.println("Multiplication:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    int sum = 0;
                    for (int k = 0; k < cols1; k++) {
                        sum += a[i][k] * b[k][j];
                    }
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Multiplication needs columns of first = rows of second.");
        }
    }
}
