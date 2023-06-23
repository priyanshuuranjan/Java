import java.util.Scanner;

public class X_19_ps4 {
    public static void main(String[] args) {
        // question
        /*
         * int m1, m2, m3;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter your marks in phy");
         * m1 = sc.nextInt();
         * System.out.println("Enter your marks in maths");
         * m2 = sc.nextInt();
         * System.out.println("Enter your marks in chem");
         * m3 = sc.nextInt();
         * float average = (m1 + m2 + m3) / 3.0f;
         * System.out.println("your over all percentages is: " + average);
         * if (average >= 40 && m1 >= 33 && m2 >= 33 && m3 > 33) {
         * System.out.println("Congratulations!! you are pass");
         * } else {
         * System.out.println("OHHFFOO!!! you are fail");
         * }
         */
        // question 3

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter your income in Lakhs per annum");
         * float tax = 0;
         * float income = sc.nextFloat();
         * if (income <= 2.5) {
         * tax = tax + 0;
         * } else if (income > 2.5f && income <= 5f) {
         * tax = tax + 0.05f * (income - 2.5f);
         * } else if (income > 5f && income <= 10.0f) {
         * tax = tax + 0.05f * (5.0f - 2.5f);
         * tax = tax + 0.2f * (income - 5f);
         * } else if (income > 10.0f) {
         * tax = tax + 0.05f * (5.0f - 2.5f);
         * tax = tax + 0.2f * (10.0f - 5f);
         * tax = tax + 0.3f * (income - 10.0f);
         * }
         * System.out.println("The total tax paid by the employee is: " + tax);
         * 
         */
        // Question 4:

        // Scanner sc = new Scanner(System.in);
        // int day = sc.nextInt();
        //
        // switch (day){
        // case 1 -> System.out.println("Monday");
        // case 2 -> System.out.println("Tuesday");
        // case 3 -> System.out.println("Wednesday");
        // case 4 -> System.out.println("Thursday");
        // case 5 -> System.out.println("Friday");
        // case 6 -> System.out.println("Saturday");
        // case 7 -> System.out.println("Sunday");
        // }
        // question 6
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an organizational website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a Commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        }
        // question 5

        int year;
        System.out.println("Enter a year");
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Year is a leap year");
        } else {
            System.out.println("Year is not a leap year");
        }

    }
}
