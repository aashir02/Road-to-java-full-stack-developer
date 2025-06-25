import java.util.Scanner;

public class Arrays4{
    public static void main(String[] args){
        int[] number = new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 values: ");
        for(int i =0;i<5;i++){
            number[i]=sc.nextInt();
        }

        System.out.println("The stored values are: ");
        for(int i=4;i>=0;i--){
            System.out.println(number[i]);
        }
    }
}