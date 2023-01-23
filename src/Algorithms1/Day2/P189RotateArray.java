package Algorithms1.Day2;

public class P189RotateArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7};
        int k = 10;

        rotate(numbers, k);
    }

    public static void rotate(int[] nums, int k) {

        k = k % nums.length;

        int last = nums.length - 1;
        reverse(nums, 0, last);
        reverse(nums, 0, k - 1);
        reverse(nums, k, last);
    }

    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
