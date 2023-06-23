public class X_10_Resulting_data_type {

    public static void main(String[] args) {
        /*
         * byte x = 5;
         * int y = 6;
         * short z = 8;
         * int a = y + z;
         * float b = 6.54f + x;
         * System.out.println(b);
         */

        // Increment and Decrement Operators
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is incremented
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int y = 7;
        System.out.println(++y * 8);
        // exmple howw incremented work on char
        char ch = 'a';
        System.out.println(++ch);
        // quize practice self done
        int m = 44;
        int p = 55;
        System.out.println(++m);
        System.out.println(m);
        System.out.println(p--);
        System.out.println(--p);
    }
}

/*
 * Resulting data type after arithmetic operation
 * Result = byte + short -> integer
 * Result = short + integer -> integer
 * Result = long + float -> float
 * Result = integer + float -> float
 * Result = character + integer -> integer
 * Result = character + short -> integer
 * Result = long + double -> double
 * Result = float + double -> double
 */
