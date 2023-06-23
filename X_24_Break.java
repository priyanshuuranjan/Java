public class X_24_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            System.out.println("woaooo");
            if (i == 20) {
                System.out.println("ending of the loop");
                break;
            }
            /*
             * continue statement example
             * for(int i=7;i>0;i--){
             * if(i==3){
             * continue;//continue skips the rest statement
             * }
             * System.out.println(i);
             * }
             */
        }
    }

}
