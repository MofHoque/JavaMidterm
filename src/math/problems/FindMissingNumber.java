package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("The missing number is: "+  missNum(array));

    }
    public static int missNum(int[] array){
        int m = array.length+1;
        int total = 0;
        int totalArray=0;
        for(int i = 0; i<array.length; i++){
            totalArray +=array[i];
        }
        for(int i = 1; i <=m; i++){
            total += i;
        }
        int finalNum = total-totalArray;

        return finalNum;
    }
}
