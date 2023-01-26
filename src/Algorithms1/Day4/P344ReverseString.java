package Algorithms1.Day4;

public class P344ReverseString {

    public static void main(String[] args) {

        char[] arr = new char[] {'h','e','l','l','o'};
        char[] test = new char[] {'H','a','n','n','a','h'};

        reverseString(arr);
        System.out.println(new String(arr));
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
