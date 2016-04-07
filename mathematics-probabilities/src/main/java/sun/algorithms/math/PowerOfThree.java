package sun.algorithms.math;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by sun on 05/04/16.
 */
public class PowerOfThree
{
    public static boolean isPowerOfThreeLog(int n)
    {
        if (n <= 0)
            return false;

        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }

    public static boolean isPowerOfThreeLoop(int n)
    {
        if (n <= 0)
            return false;

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public static boolean isPowerOfThree(int n)
    {
        int max = (int) maxPowerInt(2);
        return n > 0 && max % n == 0;
    }

    private static long maxPowerInt(int base)
    {
        long res = 1;
        while (res <= Integer.MAX_VALUE) {
            res *= base;
        }

        return res / base;
    }

    public static void main(String[] args)
    {
        System.out.println(isPowerOfThreeLog(3));
        System.out.println(isPowerOfThreeLoop(243));
        System.out.println(isPowerOfThree(27));
    }
}
