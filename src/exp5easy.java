
    import java.util.*;

    public class exp5easy {

        // Method to parse String into Integer
        static int parseNumber(String s) {
            return Integer.parseInt(s);
        }

        public static void main(String[] args) {

            // Strings
            String s1 = "10";
            String s2 = "20";
            String s3 = "30";

            // Parsing String into int
            int a = parseNumber(s1);
            int b = parseNumber(s2);
            int c = parseNumber(s3);

            // Autoboxing: int -> Integer
            ArrayList<Integer> numbers = new ArrayList<>();

            numbers.add(a);
            numbers.add(b);
            numbers.add(c);

            int sum = 0;

            // Unboxing: Integer -> int
            for (Integer n : numbers) {
                sum = sum + n;
            }

            System.out.println("Numbers: " + numbers);
            System.out.println("Sum = " + sum);
        }
    }

