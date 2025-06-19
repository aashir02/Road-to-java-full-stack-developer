class Tommy{
    public void hit(){
        System.out.println("hitting....");
    }
    public void run(){
        System.out.println("running....");
    }
    public void fire(){
        System.out.println("firing....");
    }
}
 public class Gamesim{
    public static void main(String[] args){
        Tommy player1=new Tommy();
        player1.run();
        player1.hit();
        player1.run();
        player1.fire();
    }
 }