class MethodOverloading{
    public static void main(String[] args){
        add();
        add(5);
        add(4,5);
        add('s',9);
    }

    public static void add(){
        System.out.println("helooo");
    }

    public static void add(int a){
        System.out.println("hai");
    }

    public static void add(int a , int b){
        System.out.println("welcome");
    }

    public static void add(char b,int a){
        System.out.println("ha");
    }
    
    
}