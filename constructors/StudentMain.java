class  Student{
    int sid;
    String name;
    //parametrized comstructor
    Student(int sid,String name){
        this.sid = sid ;
        this.name = name;
        //System.out.println(sid);
        //System.out.println(name);
    }
    

}
class StudentMain {
    public static void main(String[] args) {
        Student s = new Student(1,"Rohan");
        System.out.println(s.sid);
        System.out.println(s.name);
        
    }

    

}