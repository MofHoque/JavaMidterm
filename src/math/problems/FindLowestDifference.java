package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        System.out.println("Lowest difference between Array 1 and Array 2 is: "+ lowestDiff(array1, array2));

    }
    public static int lowestDiff(int[] array1, int[] array2){
        int lowMin= Integer.MAX_VALUE;
        int difference = 0;
        for(int i = 0; i<array1.length; i++){
            for (int j = 0; j< array2.length; j++){
                difference = Math.abs(array1[i]-array2[j]);
                if (difference<lowMin){
                    lowMin = difference;
                }
            }
        }
        return lowMin;
    }

}
