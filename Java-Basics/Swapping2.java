public class Swapping2{
    public static void main(String[] args){
        int a=34;
        int b=12;

        System.out.println("Before swapping: a = "+a+" b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a = "+a+" b = "+b);
    }
}