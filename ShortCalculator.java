 
import java.util.Scanner;

public class ShortCalculator {
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
        System.out.print("Choose the calculation you want to do:");
         System.out.print("Enter an operator (+, -, *, /): ");
        char calc = scanner.next().charAt(0);
        short result=0;
        short a=(short)(Math.random()*65535+1);
        short b=(short)(Math.random()*65535+1);
       
        
        switch(calc){
            case '+':
                int sum=a+b;
                short sum1=(short)sum;
                result=sum1;
                System.out.println(a+" "+b+" "+result);
                break;
            case '-':    
                int diff=a-b;
                short diff1=(short)diff;
                result=diff1;
                System.out.println(a+" "+b+" "+result);
                break;
            case '*':  
                int product=a*b;
                short product1=(short)product;
                result=product1;
                System.out.println(a+" "+b+" "+result);
                break;
            case '/':
                int quotient=a/b;
                short quotient1=(short)quotient;
                result=quotient1;
                System.out.println(a+" "+b+" "+result);
                break;
            case '%': int remainder=a%b;
                      short rem=(short)remainder;
                      result=rem;
                      System.out.println(a+" "+b+" "+result);
                      break;
             default:
                System.out.printf("You have entered wrong input");
               break;          
                       
        } 
    }
}

