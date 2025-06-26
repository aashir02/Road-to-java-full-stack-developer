import java.util.Scanner;

class Library {
    int bookCount = 0;
    int issuedCount = 0;
    String[] availableBooks = new String[10];
    String[] issuedBooks = new String[10];

    // Add book method
    public void addBook(String a) {
        availableBooks[bookCount] = a;
        bookCount++;
        System.out.println(a + " added successfully.");
    }

    // Issue book method
    public void issueBook(String a) {
        boolean found = false;
        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i] != null && a.equals(availableBooks[i])) {
                issuedBooks[issuedCount] = availableBooks[i];
                issuedCount++;
                availableBooks[i] = null;
                System.out.println("The book " + a + " is issued.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The book " + a + " is not available.");
        }
    }

    // Display available books
    public void availableBooks() {
        System.out.println("The list of available books are: ");
        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i] != null) {
                System.out.println(availableBooks[i]);
            }
        }
    }
}

public class LibrarySys {
    public static void main(String[] args) {
        Library lb = new Library();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nWelcome to AshTech Library System Management!!!!");
            System.out.println("Menu:");
            System.out.println("1. Show available Books");
            System.out.println("2. Add Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Exit");
            System.out.print("Choose your option: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume leftover newline

            if (choice == 1) {
                lb.availableBooks();
            } else if (choice == 2) {
                System.out.print("Enter the name of the book to be added: ");
                String book = sc.nextLine();
                lb.addBook(book);
            } else if (choice == 3) {
                System.out.print("Enter the name of the book to be issued: ");
                String book = sc.nextLine();
                lb.issueBook(book);
            } else if (choice == 4) {
                System.out.println("Exiting.....");
                break;
            } else {
                System.out.println("Invalid option! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
