import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class exp4_1 {
    static class Card {
        String symbol;
        String value;

        Card(String symbol, String value) {
            this.symbol = symbol;
            this.value = value;
        }

        @Override
        public String toString() {
            return value + " of " + symbol;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<Card>> cardsBySymbol = new HashMap<>();

        System.out.print("How many cards do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Clears newline

        for (int i = 0; i < count; i++) {

            System.out.println("\nCard " + (i + 1));

            System.out.print("Enter card value (A, 2, 3 ... K): ");
            String value = scanner.nextLine();

            System.out.print("Enter card symbol (Hearts, Diamonds, Clubs, Spades): ");
            String symbol = scanner.nextLine();

            String symbolKey = symbol.toLowerCase();

            if (!cardsBySymbol.containsKey(symbolKey)) {
                cardsBySymbol.put(symbolKey, new ArrayList<Card>());
            }

            cardsBySymbol.get(symbolKey).add(new Card(symbol, value));

        System.out.println("\n----- All Cards -----");

        for (ArrayList<Card> cards : cardsBySymbol.values()) {
            for (Card card : cards) {
                System.out.println(card);
            }
        }

        System.out.print("\nEnter a symbol to find: ");
        String searchSymbol = scanner.nextLine();

        ArrayList<Card> matchingCards =
                cardsBySymbol.get(searchSymbol.toLowerCase());

        System.out.println("\nCards in " + searchSymbol + ":");

        if (matchingCards != null && !matchingCards.isEmpty()) {
            for (Card card : matchingCards) {
                System.out.println(card);
            }
        } else {
            System.out.println("No cards found for this symbol.");
        }

        scanner.close();
    }
}
}
