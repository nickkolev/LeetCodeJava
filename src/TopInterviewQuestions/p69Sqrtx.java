package TopInterviewQuestions;

import java.util.Scanner;

public class p69Sqrtx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());

        long r = x;
        while (r*r > x) {
            r = (r + x/r) / 2;
        }
        System.out.println((int) r);
    }
}
