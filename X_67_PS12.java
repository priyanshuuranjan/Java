// problem 1
package calc;

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Your Results is: " + a + b);
    }
}

class ScCalculator {
    public void calculate(int a, int b) {
        System.out.println("Your Results is: " + Math.sin(a + b));
    }
}

class HyCalculator {
    public void calculate(int a, int b) {
        System.out.println("Your Results is: " + a + b);
        System.out.println("Your Results is: " + Math.sin(a + b));

    }
}

public class X_67_PS12 {
    public static void main(String[] args) {

        System.out.println("IM Main Method!!!");
    }

}
