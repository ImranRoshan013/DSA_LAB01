package APNA_COLLAGE;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("enter the values");

        for (int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("enter the nmber to find the index");
        int x= sc.nextInt();

        // linear search
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("x found ar index : "+i);
            }
        }
    }
}
