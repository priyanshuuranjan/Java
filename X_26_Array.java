public class X_26_Array {
    public static void main(String[] args) {

        int[] marks = new int[5];// syntax of Array when we have to assign any
                                 // value by the help of array
        // we can also use this way to declear any Array
       // int[] age = { 100, 50, 60, 70, 45 };
        marks[0] = 35;
        marks[1] = 65;
        marks[2] = 40;
        marks[3] = 25;
        marks[4] = 100;
        System.out.println(marks[0]);
        System.out.println(marks[1] + marks[2]);
        /*
         * There are three main ways to create an array in Java
         * 1. Declaration and memory allocation
         * int [] marks = new int[5];
          
         * 2. Declaration and then memory allocation
         * int [] marks;
         * marks = new int[5];
         * Initialization
         * marks[0] = 100;
         * marks[1] = 60;
         * marks[2] = 70;
         * marks[3] = 90;
         * marks[4] = 86;
         * 
         * 3. Declaration, memory allocation and initialization together
         * int [] marks = {98, 45, 79, 99, 80};
         */

    }

}
