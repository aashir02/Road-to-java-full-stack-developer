import java.util.Scanner;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public String setName(String n){
        name=n;
        return name;
    }
    
}
public class Oops_intro{
    public static void main(String[] args){

        //obj for name harry
        Employee harry=new Employee();
        harry.name="Harry";
        harry.salary=10000;
        System.out.println("Salary of harry is "+ harry.getSalary());

        //obj for james
        Employee james=new Employee();
        james.name="James";
        james.salary=100;
        System.out.println("Name of current employee is "+ james.getName());

        //obj for changing name from voldemort to tom riddle
        Employee voldemort=new Employee();
        voldemort.name="Voldemort";
        voldemort.salary=100;
        System.out.println("Name of current employee is "+ voldemort.getName());
        System.out.println("New name for "+ voldemort.getName() + " is "+ voldemort.setName("Tom Riddle"));

    }
}