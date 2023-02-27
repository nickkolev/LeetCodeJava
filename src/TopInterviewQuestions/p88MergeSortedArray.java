package TopInterviewQuestions;

public class p88MergeSortedArray {
    public static void main(String[] args) {

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1; // nums1 size
        int j = n-1; // nums2 size
        int k = nums1.length-1; // nums1 total length

        while(j>=0){
            if(i>=0 & j>=0 && nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
    }
}
