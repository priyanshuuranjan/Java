
// write a code to calculate the percentage of the the student comes in school by userinput.
import java.util.Scanner;

public class X_06_Exercise1 {
    public static void main(String[] args) {
        System.out.println("enter yours marks here");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your m1");
        int physics = scan.nextInt();
        System.out.println("enter your m2");
        int chemistry = scan.nextInt();
        System.out.println("enter your m3");
        int maths = scan.nextInt();
        System.out.println("enter your m4");
        int english = scan.nextInt();
        System.out.println("enter your m5");
        int biology = scan.nextInt();
        float percentage = ((physics + chemistry + maths + english + biology) / 500.0f) * 100;
        System.out.println("percentage :");
        System.out.println(percentage);

    }

}
