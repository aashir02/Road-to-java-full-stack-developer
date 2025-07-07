class Employee{
    int eid;
    String ename;
    int sal;
    Employee(int eid){
        this.eid=eid;
    }
    Employee(int eid , String name){
        this.eid=eid;
        this.ename=ename;
    }
    Employee(int eid,String ename,int sal){
        this.eid=eid;
        this.ename=ename;
        this.sal=sal;
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee(100);
        Employee e1 = new Employee(101,"Rahul");
        Employee e2 = new Employee(102,"Suahana",25000);
        System.out.println(e.eid);
        System.out.println(e1.eid);
        System.out.println(e1.ename);
        System.out.println(e2.eid);
        System.out.println(e2.ename);
        System.out.println(e2.sal);


    }
    

}