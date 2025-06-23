class Student{
    int age;
    String name;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public  void getDetails(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
    }
}
public class Easy{
    public static void main(String[] args){
        Student s1 = new Student("Rohan",21);
        Student s2 = new Student("Sohan",22);
        s1.getDetails();
        s2.getDetails();

    }
}