package Algorithms1.Day4;

public class P557ReverseWordsInAStringIII {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";

        s = reverseWords(s);
        System.out.println(s);
    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");

        for (String word : words) {
            result.append(reverseString(word.toCharArray()));
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static String reverseString(char[] c) {
        int left = 0;
        int right = c.length - 1;

        for (int i = 0; i < c.length / 2; i++) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;
        }

        return new String(c);
    }
}
