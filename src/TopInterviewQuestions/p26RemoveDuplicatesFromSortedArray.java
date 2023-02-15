package TopInterviewQuestions;

public class p26RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int[] nums = new int[] {1, 1, 2};
        int uniqueElements = 1;

        int leftPointer = 0;
        int rightPointer = 1;

        while(rightPointer < nums.length) {
            if(nums[leftPointer] == nums[rightPointer]) {
                rightPointer++;
            } else {
                nums[leftPointer + 1] = nums[rightPointer];
                uniqueElements++;
                leftPointer++;
                rightPointer++;
            }
        }

        for (int i = 0; i < uniqueElements; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
