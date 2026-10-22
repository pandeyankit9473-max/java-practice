import java.util.Scanner;

class Book {

    int bookId;
    String bookTitle;
    String author;
    boolean available;

    Book(int bookId, String bookTitle, String author) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.available = true;
    }

    void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book issued successfully");
        } else {
            System.out.println("Book is already issued");
        }
    }

    void returnBook() {
        available = true;
        System.out.println("Book returned successfully");
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
    }
}

public class LibraryDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        Book b1 = new Book(id, title, author);

        b1.displayBook();

        b1.issueBook();

        b1.displayBook();

        b1.returnBook();

        b1.displayBook();

        sc.close();
    }
}