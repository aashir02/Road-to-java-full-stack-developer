import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        do{
            System.out.println("Welcome all...!");
            System.out.println("Enter y/n: ");
            c = sc.next().charAt(0);
        }while(c=='Y'||c=='y');
        System.out.println("Exiting..");
    }
    

}
