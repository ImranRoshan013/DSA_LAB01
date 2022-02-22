package APNA_COLLAGE;

import java.util.Scanner;

public class Arrays_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        // rows
        for (int i=0;i<rows;i++){
            // col
            for (int j=0;j<cols;j++){
                System.out.println("["+i+"]"+"["+j+"]");
                numbers[i][j] = sc.nextInt();
            }
        }


        System.out.println("The array is ");
        for (int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}
