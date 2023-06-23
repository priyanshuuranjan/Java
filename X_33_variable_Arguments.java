public class X_33_variable_Arguments {
    // ye sb lendi methods hai kyo ki hme koi v arguments pass krne k liye
    // ek naya main methods bnana pr rha hai
    // static int sum(int a, int b) {
    // return a + b;
    // }
    // static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // shot and eassy methods and this methods is named as varargs methods
    static int sum(int... arr) {
        // Available as int [] arr;
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is " + sum(4, 5));
        System.out.println("The sum of 4 and 5,2 and 10 and " + sum(4, 5, 2, 10));
    }
}
