class  Monkey{
    public static void jump() {
        System.out.println("Im jumping...");
    }
    public static void bite() {
        System.out.println("Biting ouch...");
    }
}
interface BasicAnimal{
    void eat() {
        System.out.println("I can eat...");
    }
    void sleep() {
        System.out.println("Im sleeping...");
    }
}
public class  Human extends Monkey implements BasicAnimal{
    public static void main(String[] args) {
        Human h = new Human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();    
    }

}
