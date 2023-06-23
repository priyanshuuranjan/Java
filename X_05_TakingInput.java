import java.util.Scanner;

public class X_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner y = new Scanner(System.in);
        System.out.println("Enter 1 number");
        int a = y.nextInt();
        System.out.println("Enter 2 number");
        int b = y.nextInt();
        int Sum = a + b;
        y.close();
        System.out.println("the sum is ");
        System.out.println(Sum);
    }
}