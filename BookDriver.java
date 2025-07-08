class Book{
    String title = "Harry potter";
    static int price = 100;
    public static void read() {
        System.out.println("i am ");
    }
    void study(){
        System.out.println(title);
        System.out.println(price);
        read();
    }
}
public class BookDriver {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.study();
    }
    

}