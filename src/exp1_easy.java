import java.util.Scanner;

public class exp1_easy {
        public static void main(String[] args) {
            System.out.println("Enter the String : ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            int vowels = 0;
            int consonants = 0;

            for (int index = 0; index < input.length(); index++) {
                char current = input.charAt(index);

                if (Character.isLetter(current)) {
                    char lower = Character.toLowerCase(current);
                    if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            String reversed = new StringBuilder(input).reverse().toString();

            System.out.println("Length: " + input.length());
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Reverse: " + reversed);
        }
    }


