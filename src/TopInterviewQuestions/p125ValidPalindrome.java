package TopInterviewQuestions;

public class p125ValidPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {

        int head = 0;
        int tail = s.length() - 1;

        while (tail > head) {

            if(!Character.isLetterOrDigit(s.charAt(head))) {
                head++;
            } else if (!Character.isLetterOrDigit(s.charAt(tail))) {
                tail--;
            } else if (Character.toLowerCase(s.charAt(tail)) != Character.toLowerCase(s.charAt(head))) {
                return false;
            } else {
                head++;
                tail--;
            }

        }
        return true;
    }
}
