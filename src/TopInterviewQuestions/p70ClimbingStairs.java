package TopInterviewQuestions;

import java.util.Scanner;

public class p70ClimbingStairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());

        System.out.println(recursion(x));
    }

    //recursion approach
    public static int recursion(int x) {
        if(x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }else if (x == 2) {
            return 2;
        }else if (x == 3) {
            return 3;
        } else {
            return recursion(x - 1) + recursion(x - 2);
        }
    }
}
