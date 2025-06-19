import java.util.Scanner;
public class BankSimulator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance=10000;
        int choice;
        int deposit;
        int withdraw;
        do{
            System.out.println("Welcome to AshTech ATM!!!!\nFrom the below menu choose your option number for that particular option");
            System.out.println("1. Check Balance \n2. Deposit Money\n3. Withdraw Money\n4. Exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your available balance is "+ balance);
                    break;
                case 2:
                    System.out.print("How much money do you want to add into your account\nEnter your amount:");
                    deposit=sc.nextInt();
                    System.out.println("Your amount has been succesfully credited into your account");
                    balance+=deposit;
                    System.out.println("New balance: ₹" + balance);
                    break;
                case 3:
                    System.out.print("How much do you wish to withdraw from your account\nEnter the required amount:");
                    withdraw=sc.nextInt();
                    if (withdraw<=balance){
                        balance-=withdraw;
                        System.out.println("Your amount has been withdrawn succesfully");
                        System.out.println("New balance: ₹" + balance);
                        break;
                    }
                    else{
                        System.out.println("Insufficient fund...\nTry again ");
                        break;
                    }
                case 4:
                    System.out.println("Thank you for using our services\nExiting...");
                    break;
                default:
                    System.out.println("Invalid choice !!! Try again...");

    
            }
        }while(choice!=4);
    }
}