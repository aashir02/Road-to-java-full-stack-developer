class CarMain{
    public static void main(String[] args) {
        Car c = new Car();
        c.setmName("Bence");
        //c.setHp(600);  //wrong - no reference to Engine class
        c.getEngine().setHp(400);

        System.out.println(c.getmName());
        System.out.println(c.getEngine().getHp());
    }
}