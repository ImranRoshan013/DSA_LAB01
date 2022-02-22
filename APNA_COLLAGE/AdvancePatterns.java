package APNA_COLLAGE;

public class AdvancePatterns {
    public static void main(String[] args) {
        System.out.println("Butterfly pattern");
        int n=5;
        // upper half
        for(int i=1;i<=n;i++){
            // 1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // 2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for(int i=n;i>=1;i--){
            // 1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // 2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");
        System.out.println("Solid Rhombus");
        n=5;
        for(int i=1;i<=n;i++){
            // spaces
            int spaces = (n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");
        System.out.println("Number pyramid");
        n=5;
        for(int i=1;i<=n;i++){
            // Spaces
            int spaces =(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");
        System.out.println("Palindromic pattern");
        n=5;
        for(int i=1;i<=n;i++){
            // spaces
            int spaces = n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
       n=4;
        for(int i=1;i<=n;i++){
            // spaces
            int spaces = n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // 2nd part
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //  second half
        for(int i=n;i>=1;i--){
            // spaces
            int spaces = n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // 2nd part
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
