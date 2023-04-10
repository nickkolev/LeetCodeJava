package TopInterviewQuestions;

public class p11ContainerWithMostWater {
    public static void main(String[] args) {

        int[] height = new int[] {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = Integer.MIN_VALUE;

        while (leftPointer < rightPointer) {
            int area = calcArea(height, leftPointer, rightPointer);
            if(area > maxArea) {
                maxArea = area;
            }

            if(height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxArea;
    }

    public static int calcArea(int[] height, int left, int right) {
        return (Math.min(height[left], height[right])) * (right - left);
    }
}
