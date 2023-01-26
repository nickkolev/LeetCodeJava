package Algorithms1.Day3;

public class P167TwoSumII_InputArrayIsSorted {

    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] numbers, int target) {

        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while (leftPointer <= rightPointer) {
            int sum = numbers[leftPointer] + numbers[rightPointer];

            if(sum < target) {
                leftPointer++;
            } else if(sum > target) {
                rightPointer--;
            } else {
                return new int[] {leftPointer + 1, rightPointer + 1};
            }
        }

        return new int[] {leftPointer + 1, rightPointer + 1};
    }
}
