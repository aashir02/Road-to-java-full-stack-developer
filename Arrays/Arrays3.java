import java.util.Scanner;

public class Arrays3{
    public static void main(String[] args){
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");
        for(int i=0;i<5;i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("Enter the number to search: ");
        int search=sc.nextInt();
        for(int i=0;i<5;i++){
            if(numbers[i]==search){
                System.out.println("The number you searched for is found at position "+(i+1));
                return;
            }
            
        }
        System.out.println("invalid search ");
    }
}