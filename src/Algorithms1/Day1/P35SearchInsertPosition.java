package Algorithms1.Day1;

public class P35SearchInsertPosition {
    public static void main(String[] args) {

    }

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(target > nums[mid]) {
                low = mid + 1;
            } else if(target < nums[mid]) {
                high = mid - 1;
            }
        }
        return low;
    }
}

