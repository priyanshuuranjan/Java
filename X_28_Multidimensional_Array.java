public class X_28_Multidimensional_Array {
    public static void main(String[] args) {
        int[] marks;// 1 D Array
        int[][] flats;// in 2D Array we work for both [i] And [j]
       // int[][][] flats;// this is used for 3-D Array
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 101;
        flats[0][2] = 101;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        // Displaying the 2-D Array (for Loop)
        System.out.println("printing a 2-D Array using for loop");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) { // nested loop were used here
                System.out.print(flats[i][j]);
                System.out.print(" "); // this line provide a Space when programs were runs
            }
            System.out.println("");
        }

    }

}
