
import java.util.Scanner;

class Book {
    protected String title;
    protected String author;
    protected String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}


class Fiction extends Book {
    private String genre;

    public Fiction(String title, String author, String isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: Fiction");
        System.out.println("Genre: " + genre);
    }
}


class NonFiction extends Book {
    private String subject;

    public NonFiction(String title, String author, String isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: Non-Fiction");
        System.out.println("Subject: " + subject);
    }
}


 class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Library Management System ---");
        System.out.println("1. Add Fiction Book");
        System.out.println("2. Add Non-Fiction Book");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Book book = null;

        if (choice == 1) {
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            System.out.print("Enter ISBN: ");
            String isbn = sc.nextLine();
            System.out.print("Enter genre: ");
            String genre = sc.nextLine();

            book = new Fiction(title, author, isbn, genre);

        } else if (choice == 2) {
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            System.out.print("Enter ISBN: ");
            String isbn = sc.nextLine();
            System.out.print("Enter subject: ");
            String subject = sc.nextLine();

            book = new NonFiction(title, author, isbn, subject);
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        System.out.println("\n--- Book Details ---");
        book.displayDetails();

        sc.close();
    }
}
