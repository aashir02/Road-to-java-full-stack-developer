abstract class  Pen{
    abstract void write();
    abstract void refill();
}

class hum extends Pen{
    void write(){
            System.out.println("haaaaaaaaaaaaai");
        }
    void refill(){
        System.out.println("Helloo");
    }

    

}
public class Penstand {
    public static void main(String[] args) {
        hum obj = new hum();
        obj.write();
        obj.refill();        
    }
    
}
