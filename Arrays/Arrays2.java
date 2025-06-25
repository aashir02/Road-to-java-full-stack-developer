import java.util.Scanner;

public class Arrays2{
    public static void main(String[] args){
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");
        for(int i=0;i<5;i++){
            numbers[i]=sc.nextInt();
        }
        int largest=numbers[0];
        for(int i=0;i<5;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        System.out.println("The largest element is :"+largest);
    }
}