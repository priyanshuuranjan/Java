import java.util.Scanner;

public class X_18_elseIf {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("your welcome in coldrink party");
                break;
            case 23:
                System.out.println("nhi tum nhi AA skte");
                break;
            case 45:
                System.out.println("you are too old for the party");
                break;
            case 65:
                System.out.println("go and sleep");
                break;
            default:
                System.out.println("kuch to sarm kr lo");

        }

        /*
         * int age = 20;
         * System.out.println("enter your age to get verification results in today coldrink party");
         * if(age <20){
         * System.out.println("your welcome in today party");
         * 
         * }
         * else if(age>20){
         * System.out.println("chal nikal");
         * }
         * else if(age>10){
         * System.out.println("sochna v nhi party k liye");
         * }
         */
    }

}
