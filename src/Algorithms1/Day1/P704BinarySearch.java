package Algorithms1.Day1;

public class P704BinarySearch {
    public static void main(String[] args) {

        int[] numbers = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(search(numbers, target));
    }

    public static int search(int[] nums, int target) {

        if(nums.length == 0) return -1;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = low - 1;
            }
        }

        return -1;
    }
}
