package APNA_COLLAGE;

public class Second {
    public static void main(String[] args) {
        System.out.println("Solid Rectangle");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        System.out.println("Hollow RectNGLE");
        int n=4;
        int m=5;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                // Cell(i,j)
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        System.out.println("Half pyramid");
        n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        System.out.println("Half pyramid");
        n=4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        System.out.println("Inverted Half pyramid");

        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // inner loop for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        System.out.println("Half pyramid with number");
        n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");
        System.out.println("Floyed's Triangle");
        int num =1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        System.out.println("0-1 Triangle");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum % 2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }

            }  System.out.println();
        }
    }
}
