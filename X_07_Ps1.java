import java.util.Scanner;

public class X_07_Ps1 {
    public static void main(String[] args) {
        // int num1 = 4;
        // int num2 = 5
        // int num3 = 6;
        // int sum;
        // sum = num1 + num2 + num3;
        // System.out.println(sum);

        // question 2
        // int phy=45;
        // int maths=98;
        // int chem=75;

        // float sum = ((phy+maths+chem)/300.0f)*100;
        // System.out.println(sum);//

        // question 3

       // Scanner y = new Scanner(System.in);
       // System.out.println("Enter your name ");
       // String name = y.next();
       // System.out.println(" hello " + name + " have  good daY ");
       // question 4
       
		double kilometers;

		System.out.println("Please enter kilometers:");

		Scanner y = new Scanner(System.in);
		kilometers = y.nextDouble();

		double miles = kilometers / 1.6;

		System.out.println(miles + " Miles");

    }

}
