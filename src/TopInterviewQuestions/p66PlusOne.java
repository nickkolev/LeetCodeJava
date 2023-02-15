package TopInterviewQuestions;

import java.util.Arrays;

public class p66PlusOne {
    public static void main(String[] args) {

        int[] digits = new int[] {1, 1, 2};

        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }

            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        System.out.println(Arrays.toString(digits));
    }
}
