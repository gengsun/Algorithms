package sun.algorithms.math;

/**
 * Created by sun on 16/04/16.
 */
public class SubtractMultiplyDivide
{
    public static int subtract(int a, int b)
    {
        return a + negate(b);
    }

    public static int multiply(int a, int b)
    {
        if (abs(a) < abs(b))
            return multiply(b, a);

        int res = 0;
        for (int i = 0; i < abs(b); i++) {
            res += a;
        }

        if (b < 0)
            return negate(res);

        return res;
    }

    public static int divide(int a, int b)
    {
        if (b == 0)
            throw new RuntimeException("can not divide a zero...");

        int absa = abs(a), absb = abs(b);
        int res = 0, x = 0;

        while (x + absb <= absa)
        {
            x += absb;
            res++;
        }

        if (a > 0 ^ b > 0)
            return negate(res);

        return res;
    }

    private static int negate(int a)
    {
        int res = 0;
        int x = a > 0 ? -1 : 1;

        while (a != 0)
        {
            a += x;
            res += x;
        }

        return res;
    }

    private static int abs(int a)
    {
        if (a < 0)
            return negate(a);

        return a;
    }

    public static void main(String[] args)
    {
        System.out.println(subtract(7, 9));
        System.out.println(multiply(-5, -9));
        System.out.println(divide(-7, -9));
    }
}
