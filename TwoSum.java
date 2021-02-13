/*
*Given a UNSORTED array of integers, return the indices of the two numbers whose sum is equal to a given target.
     *Return -1 if nothing a solution cannot be found.
*You may assume that each input would have exactly one solution, and you may not use the same element twice.
    *Check figure 1 or figure 2 for example output.
 */
import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] num, int sum) {
        int[] sumIndices = new int[2];
        int[] noSolution = {-1};
        for (int i = 0; i < num.length - 1; i++){
            for (int j = i + 1; j < num.length; j++) {
                if ((num[i] + num[j]) == sum) {
                    sumIndices[0] = i;
                    sumIndices[1] = j;
                    return sumIndices;
                }
            }
        }

        return noSolution;
    }


    public static void main(String[] args) {
        TwoSum lab2= new TwoSum();
        int[] num = {2, 12, 8, 7};
        int sum = 9; // target
        System.out.println(Arrays.toString(lab2.twoSum(num, sum)));
    }
}
