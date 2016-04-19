package sun.algorithms.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sun on 19/04/16.
 */
public class HouseRobber
{
    public static int rob(int[] a)
    {
        if (a.length == 0)
            return 0;

        if (a.length == 1)
            return a[0];

        if (a.length == 2)
            return Math.max(a[0], a[1]);

        int[] dp = new int[a.length];
        dp[0] = a[0];
        dp[1] = Math.max(a[0], a[1]);

        for (int i = 2; i < a.length; i++) {
            dp[i] = Math.max(dp[i - 1], a[i] + dp[i - 2]);
        }

        return dp[a.length - 1];
    }

    public static void main(String[] args)
    {
        int[] a = {1, 3, 5, 4, 6, 9, 11};
        System.out.println(rob(a));
    }
}
