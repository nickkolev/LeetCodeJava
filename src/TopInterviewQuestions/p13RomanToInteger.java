package TopInterviewQuestions;

import java.util.Scanner;

public class p13RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int finalSum = 0;

        char prev = ' ';
        for (byte i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            finalSum += getValue(c, prev);
            prev = c;
        }

        System.out.println(finalSum);
    }

    private static int getValue(char c, char prev) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return prev == 'I' ? 3 : 5;
            case 'X':
                return prev == 'I' ? 8 : 10;
            case 'L':
                return prev == 'X' ? 30 : 50;
            case 'C':
                return prev == 'X' ? 80 : 100;
            case 'D':
                return prev == 'C' ? 300 : 500;
            case 'M':
                return prev == 'C' ? 800 : 1000;
        }

        return 0;
    }
}

