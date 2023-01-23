package Algorithms1.Day1;

public class P35SearchInsertPosition {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,6};
        int target = 2;

        System.out.println(searchInsert(numbers, target));
    }

    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int middle = (high - low) / 2;
            if(target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return low;
    }
}

