package Algorithms1.Day3;

public class P283MoveZeroes {

    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void moveZeroes(int[] nums) {

        int length = nums.length;
        if(length <= 1) {
            return;
        }

        int left = 0;
        int right = 1;
        while (right < length) {
            if(nums[left] != 0) {
                left++;
                right++;
            } else if (nums[right] == 0) {
                right++;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }

    }
}
