import java.util.Scanner;

class Employee{
    String name;
    int id;
    int salary;

    public void setEmployee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void getEmployee(){
        System.out.println("Name: "+ name);
        System.out.println("eid: "+ id);
        System.out.println("Salary: "+ salary);
    }
}

class Manager extends Employee{
    int teamsize;
    public void displayDetails(String name){
        System.out.println("The teamsize is "+ teamsize);
    }
}

class Developer extends Employee{
    String languageSpecialisation;
    public void displayDetails(){
        System.out.println("The language specialisation is :"+ languageSpecialisation);
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args){
        //creating class objects
        Employee emp = new Employee();
        Manager mg = new Manager();
        Developer dev = new Developer();

        //creating scanner obj
        Scanner sc = new Scanner(System.in);

        //entering details
        System.out.println("Enter name of employee: ");
        String ename = sc.nextLine();
        System.out.println("Enter id of employee: ");
        int eid = sc.nextInt();
        System.out.println("Enter salary of employee: ");
        int esal = sc.nextInt();
        emp.setEmployee(ename,eid,esal);

        System.out.println("Enter the teamsize :");
        int tsize = sc.nextInt();
        mg.teamsize = tsize;

        sc.nextLine(); //  Clear the buffer

        System.out.print("The required language specialization :");
        String langSpec = sc.nextLine();
        dev.languageSpecialisation = langSpec;

        //emp details
        System.out.println("The details of the employee are: ");
        emp.getEmployee();

        //manager class 
        mg.displayDetails(ename);

        //dev class
        dev.displayDetails();

        


    }
    
}
