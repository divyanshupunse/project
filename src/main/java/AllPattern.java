import java.util.Scanner;
public class AllPattern {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the row number");
        int num = n.nextInt();
        System.out.println("Chose the pattern to print ");
        System.out.println("1.Square  FillPattern");
        System.out.println("2.Square Hollow Pattern");
        System.out.println("3.Right Half Pyramid ");
        System.out.println("4.Left Half Pyramid");
        System.out.println("5.Number Increasing Pyramid");
        System.out.println("6.Number Changing Pyramid");
        System.out.println("7.Zero One Triangle");
        System.out.println("8.Number Triangular");
        int choice = n.nextInt();

        switch (choice) {
            case 1:
                SquareFillPattern(num);
                break;
            case 2:
                SquareHollowPattern(num);
                break;
            case 3:
                RightHalfPyramid(num);
                break;
            case 4:
                LeftHalfPyramid(num);
                break;
            case 5:
                NumberIncreasingPyramid(num);
                break;
            case 6:
                NumberChangingPyramid(num);
                break;
            case 7:
                ZeroOneTriangle(num);
                break;
            case 8:
                NumberTriangular(num);
        }
    }

    public static void SquareFillPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void SquareHollowPattern(int num){
        for(int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i==1 || i==num || j==1 || j==num){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void RightHalfPyramid(int num){
        for (int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void LeftHalfPyramid(int num){
        for (int i=1;i<=num;i++){
            // inner loop 1
            for (int j=1;j<=num-i;j++) {
                System.out.print(" ");
            }
            //inner loop 2
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void NumberIncreasingPyramid(int num){
        for (int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void NumberChangingPyramid(int num){
        int number=1;
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(number+(" "));
                number++;
            }
            System.out.println();
        }
    }

    public static void ZeroOneTriangle(int num){
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if (sum%2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }

    public static void NumberTriangular(int num){
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }

}
