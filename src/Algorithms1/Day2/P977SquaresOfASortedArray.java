package Algorithms1.Day2;

public class P977SquaresOfASortedArray {
    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int currentIndex = nums.length - 1;

        while (leftPointer <= rightPointer) {
            if(Math.abs(nums[leftPointer]) > Math.abs(nums[rightPointer])) {
                result[currentIndex] = nums[leftPointer] * nums[leftPointer];
                leftPointer++;
            } else {
                result[currentIndex] = nums[rightPointer] * nums[rightPointer];
                rightPointer--;
            }
            currentIndex--;
        }

        return result;
    }

    public int[] sortedSquares2(int[] nums) {
        int[] result = new int[nums.length];



        return result;
    }
}
