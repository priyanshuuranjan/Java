public class X_35_ps7 {
    // question 1
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d =%d\n", n, i, n * i);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumRect(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n + sumRect(n - 1);
    }

    static void pattern2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static int fib(int n) {
        /*
         * if(n==1){
         * return 0;
         * }
         * else if(n==2){
         * return 1;
         * }
         */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static int sum(int ... arr) {
        int result=0;
        for(int a: arr) {
            result += a;
        }
        return result;
    }
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // question 1
        // multiplication(4);
        // question 2
        // pattern1(4);
        // question 3
        // detail view
        // sum(n) = 1 + 2 + 3... + n
        // sum(n) = 1 + 2 + 3... + n-1 + n
        // sum(n) = sum(n-1) + n
        // sum(3) = 3 + sum(2)
        // sum(3) = 3 + 2 + sum(1)
        // sum(3) = 3 + 2 + 1
        // int c = sumRect(3);
        // System.out.println(c);
        // question 4
        // pattern2(4);

        // question 5
        int result = fib(5);
        System.out.println(result);
        // question 6
       
        System.out.format("the average result of 6 and 2 is %d", sum(6,2)/2);
        // question 8
        pattern1(9);

    }

}
