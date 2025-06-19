import java.util.Scanner;

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
    
}
public class Oops_intro2{
    public static void main(String[] args){
        System.out.println("Enter the length of side to be calculated: ");
        Scanner sc = new Scanner(System.in);
        Square sq = new Square();
        sq.side = sc.nextInt();
        System.out.println("The area of sqaure with side "+ sq.area());

        System.out.println("Enter the length of side to be calculated: ");
        sq.side = sc.nextInt();
        System.out.println("The area of sqaure with side "+ sq.area());
    }

}