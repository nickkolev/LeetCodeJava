package TopInterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class p217ContainsDuplicate {
    public static void main(String[] args) {

    }

    //first way - with HashSet
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> distinct = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(distinct.contains(nums[i])){
                return true;
            }
            distinct.add(nums[i]);
        }

        return false;
    }

}
