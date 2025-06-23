class Calculator{
    int num1,num2;
    char operator;

    Calculator(int num1,char operator,int num2){
        this.num1=num1;
        this.num2=num2;
        this.operator=operator;
    }
    public  int calculate(){
        int result;
        switch(operator){
            case '+':
                result=num1+num2;
                return result;
                
            case '-':
                result=num1-num2;
                return result;
                
            case '*':
                result=num1*num2;
                return result;
                
            case '/':
                if (num2 !=0){
                    result=num1/num2;
                    return result;
                    }
                else{
                    System.out.println("Cannot divide by 0");
                    return 0;
                }
                
                
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}
public class Medium{
    public static void main(String[] args){
        Calculator c1 = new Calculator(3,'*',2);
        int result = c1.calculate();
        System.out.println("The result is "+ result);
        

    }
}