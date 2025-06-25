import java.util.Scanner;

public class Arrays1{
    public static void main(String[] args){
        String[] number = new String[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 values: ");
        for(int i =0;i<5;i++){
            number[i]=sc.nextLine();
        }

        System.out.println("The stored values are: ");
        for(int i=0;i<5;i++){
            System.out.println(number[i]);
        }
    }
}