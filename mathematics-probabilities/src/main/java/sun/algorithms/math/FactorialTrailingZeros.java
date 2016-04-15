package sun.algorithms.math;

/**
 * Created by sun on 09/04/16.
 */
public class FactorialTrailingZeros
{
    public static int countTrailingZeros(int n)
    {
        int count = 0;
        for (long i = 5; n / i > 0; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(countTrailingZeros(15));
    }
}
