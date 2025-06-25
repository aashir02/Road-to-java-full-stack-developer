import java.util.Scanner;

public class Arrays5{
    public static void main(String[] args){
        int[] number1 = new int[5];
        int[] number2 = new int[5];

        int[] merged = new int[6];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array 1 values: ");
        for(int i =0;i<3;i++){
            number1[i]=sc.nextInt();
        }

        System.out.println("Enter array 2 values: ");
        for(int i =0;i<3;i++){
            number2[i]=sc.nextInt();
        }

        for(int i=0;i<3;i++){
            merged[i]=number1[i];
        }

        for(int i=0;i<3;i++){
            merged[i+3]=number2[i];
        }

        System.out.println("The stored values are: ");
        for(int i=0;i<6;i++){
            System.out.println(merged[i]);
        }
    }
}