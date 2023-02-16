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

    //DP
    public int dynamicApproach(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
