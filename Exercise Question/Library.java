class Library{
    int availableBooks[]; //store available books
    int issuedBooks[]; // store issued books

    public static void addBook(String a){
        availableBooks+=a;
        System.out.println(a+" added succefully ");
    }
}
public class LibrarySys{
    public static void main(String[] args){
        Library lb = new Library();
        lb.addBook("Harry Potter");

    }
}