public class Numbers1{
    public static void main(String[] args) {
        int num=10;
        for (int i = 0; i < num; i++) {
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
}
}