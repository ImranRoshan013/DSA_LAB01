package APNA_COLLAGE;
import java.util.Scanner;
public class practiceFunction {
   public static void  printFactorial(int n){
        // loop
       if(n<0){
           System.out.println("Invalid input");
           return;
       }
       else if(n==0){
           System.out.println("factorial of 0 is 1");
       }
        int fact =1;
        for(int i=n;i>=1;i--){
            fact = fact*i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for factorial");
        int n= sc.nextInt();
        printFactorial(n);
    }
}
