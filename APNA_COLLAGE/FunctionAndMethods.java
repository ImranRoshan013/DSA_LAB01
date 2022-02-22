package APNA_COLLAGE;
import java.util.*;
public class FunctionAndMethods {
    // Function
    //---------01------------------
    public static int  CalculateSum(int a,int b){
        int sum = a+b;
        return sum;
    }
    //--------------02----------------------
//      public static int Product(int a,int b){
//         int product = a*b;
//         return product;
//}
    //--------------03---------------------

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = CalculateSum(a,b);
        System.out.println(sum);

//        int product = Product(a,b);
//        System.out.println("the product of two numbers is "+product);



    }
}
