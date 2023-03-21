package TopInterviewQuestions;

public class p258AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        while(num >= 10) {
            int sum = 0;
            while(num != 0) {
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}
