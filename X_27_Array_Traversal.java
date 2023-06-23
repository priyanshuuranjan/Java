public class X_27_Array_Traversal {
    public static void main(String[] args) {
        int[] marks = { 98, 45, 79, 99, 80 };
        float[] age = { 10.1f, 45.2f, 65.3f, 100.5f };
        String[] students = { "Alpha", "Beta", "Hello!", "Tata" };

        // variable_name.lenght is used to print the the lenght of given Araay
        // variable _name could be anything
        System.out.println(marks.length);
        System.out.println(students[0]);
        System.out.println(age[0]);

        // Printing array by using for loop
        System.out.println(" Display the Array by For Loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // quiz question
        System.out.println("quiz question> print an array in reverse oder");
        for (int i = students.length - 1; i >= 0; i--) {//
            System.out.println(students[i]);
        }
        // Quiz: Displaying the array (For each loop)
        // this methon is very simple to print an array 
        System.out.println("Printing using for-each loop");
        for (int element : marks) {
            System.out.println(element);

        }

    }

}
