public class Even3 {
    public static void main(String[] args) {
        int upper=20; //between a given range
        int lower=0;
        while(lower<=upper){
            if(upper%2==0){
                System.out.println(upper+" is even");
            }
            upper--;
        }
    }
    

}