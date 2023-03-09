package TopInterviewQuestions;

public class p136SingleNumber {
    public static void main(String[] args) {

        System.out.println(singleNumber(new int[] {1, 1, 2, 3, 3, 4, 5, 6, 4, 5, 6}));
    }

    public static int singleNumber(int[] nums) {

        int result = 0;

        //bit manipulation solution

        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
