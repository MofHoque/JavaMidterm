package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
        Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".

        Write Java program to compute all permutations of any given String
         */
        String letters = "ABC";
         permutation(letters);
    }
    public static void permutation(String letters) {
        permutation("", letters);
    }
    private static void permutation(String pre, String letters){
        int n = letters.length();
        if(n==0){
            System.out.println(pre);
        }
        else {
            for(int i = 0; i<n; i++){
                permutation(pre+ letters.charAt(i), letters.substring(0,i) + letters.substring(i+1, n));
            }
        }
    }

}
