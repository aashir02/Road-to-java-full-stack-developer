class D extends B{
    static int b;
    static void demo(){
        System.out.println("from d");
    }
    public static void main(String[] args) {
        //using parent class name
        System.out.println(B.a);
        B.test();
        //System.out.println(B);
        //using child  class name
        System.out.println(D.a);
        System.out.println(D.b);
        D.test();
        D.demo();

        B bc = new B();
        System.out.println(bc.a+" //using class object");
        bc.test();
        System.out.print(" //using class object");  
    }

}