public class X_17_Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        if (a && b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println("for logical or....");
        boolean b1 = true;
        boolean b2 = true;
        if (b1 || b2) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
        System.out.println("for logical not...");
        boolean b3 = true;
        boolean b4 = false;
        if (b3 == b4) {
            System.out.println("W");
        } else {
            System.out.println("X");
        }
    }

}
