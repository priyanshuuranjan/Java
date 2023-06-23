public class X_29_ps5 {
    public static void main(String[] args) {
        /*
         * question 1
         * 
         * float[] Marks = { 2.0f, 2.5f, 3.0f, 3.5f, 4.0f };
         * 
         * method 1st
         * System.out.println("The Sum Of Array Is:");
         * System.out.println(Marks[0] + Marks[1] + Marks[2] + Marks[3] + Marks[4]);
         * 
         * // method 2nd
         * float sum = 0;
         * for (float element : Marks) {
         * sum = sum + element;
         * }
         * System.out.println("The value of sum is:");
         * System.out.println(sum);
         */

        /*
         * 
         * Question 2nd
         * 
         * float[] marks = { 2.0f, 2.5f, 3.0f, 3.5f, 4.0f };
         * float num = 20.0f;
         * boolean isInArray = false;
         * for (float element : marks) {
         * if (num == element) {
         * isInArray = true;
         * break;
         * }
         * 
         * }
         * if (isInArray) {
         * System.out.println("The value is present in array");
         * } else {
         * System.out.println("the value is not present in array");
         * }
         */
        /*
         * Question 3
         * int[] marks = { 45, 35, 65, 100, 69 };
         * int average = 0;
         * for (int element : marks) {
         * average = average + element;
         * }
         * System.out.println("The average marks of students in physics is:" + average
         * /marks.length);
         * //here marks.length is number of students in physics we can also write 5
         * // inspite of writing marks.length
         */

        /*
         * 
         * Question 4
         * 
         * int[][] marks1 = { { 25, 20, 65, },
         * { 65, 69, 80 } };
         * int[][] marks2 = { { 2, 6, 5 },
         * { 4, 8, 9 } };
         * int[][] results = { { 0, 0, 0, },
         * { 0, 0, 0 } };
         * for (int i = 0; i < marks1.length; i++) { // i can can runs row no. of times
         * for (int j = 0; j < marks1[i].length; j++) { // j can runs column no. of
         * times
         * 
         * // System.out.format("Setting value for i=%d and j=%d\n ", i, j);
         * // the upper line is used to check the format of Array
         * results[i][j] = marks1[i][j] + marks2[i][j];
         * System.out.print(results[i][j] + " ");
         * 
         * }
         * System.out.println(""); // this line only print a new line
         * }
         */
        /*
         * question 5
         * int[] arr = { 45, 65, 10, 12, 6, 100 };
         * int l = arr.length;
         * int n = Math.floorDiv(l, 2);
         * int temp;
         * 
         * for (int i = 0; i < n; i++) {
         * // Swap a[i] and a[l-1-i]
         * // a b temp
         * // |4| |3| ||
         * temp = arr[i];
         * arr[i] = arr[l - i - 1];
         * arr[l - i - 1] = temp;
         * }
         * 
         * for (int element : arr) {
         * System.out.print(element + " ");
         * }
         */
        /*
         * question 6
         * int[] arr = { 45, 65, 10, 12, 6, 100, 500 };
         * int max = 0;
         * for (int element : arr) {
         * if (element > max) {
         * max = element;
         * }
         * }
         * System.out.println("the value of the maximum element in this array is: " + max);
         * }
         */

        /* question 7
        // Integer.MIN_VALUE
        int[] arr = { 45, 65, 10, 12, 16, 100, 500 };
        int min = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }

        System.out.println("the value of the minimum element in this array is: " + min);
        */
         // Practice Problem 7
         boolean isSorted = true;
         int [] arr = {1, 12, 3, 4, 5, 34, 67};
         for(int i=0;i<arr.length-1;i++){
             if(arr[i] > arr[i+1]){
                 isSorted = false;
                 break;
             }
         }
         if(isSorted){
             System.out.println("The Array is sorted");
         }
         else{
             System.out.println("The Array is not sorted");
         }
 
 
    }

}
