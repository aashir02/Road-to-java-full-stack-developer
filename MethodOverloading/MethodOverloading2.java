import java.util.Scanner;

public class MethodOverloading2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        add(a,b);
        
    }
    public static void add(int a,int b){
        System.out.println("The sum is: "+(a+b));
    }
    
    
}