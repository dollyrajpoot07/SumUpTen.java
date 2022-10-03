// A number is considered perfect if its digits sum up to exactly 10.
// Given a positive integer n, return the n-th perfect number.
// For example, given 1, you should return 19. Given 2, you should return 28.

import java.util.*;

public class SumUpTen {
    public static int findNth(int n) {
        int count = 0;

        for (int curr = 19;; curr += 9) {

            int sum = 0;
            for (int x = curr; x > 0; x = x / 10)
                sum = sum + x % 10;

            if (sum == 10)
                count++;

            if (count == n)
                return curr;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(findNth(n));
        sc.close();
    }
}
