package TopInterviewQuestions;

import java.util.Scanner;

public class p7ReverseInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        long finalNum = 0;
        while (number != 0) {
            int lastDig = number % 10;
            finalNum += lastDig;
            finalNum = finalNum * 10;
            number = number / 10;
        }
        finalNum = finalNum / 10;
        if (finalNum > Integer.MAX_VALUE || finalNum < Integer.MIN_VALUE) {
            finalNum = 0;
        }
        if (number < 0) {
            finalNum = (int) (-1 * finalNum);
        }

        System.out.println(finalNum);
    }
}
