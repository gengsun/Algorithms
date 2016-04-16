package sun.algorithms.math;

/**
 * Created by sun on 15/04/16.
 */
public class CountPrimes
{
    public static boolean[] countPrimes(int n)
    {
        boolean[] isPrimes = new boolean[n + 1];
        for (int i = 2; i < isPrimes.length; i++) {
            isPrimes[i] = true;
        }

        for (int i = 2; i * i < n + 1; i++)
        {
            if (!isPrimes[i])
                continue;

            for (int j = i * i; j < n + 1; j += i) {
                isPrimes[j] = false;
            }
        }

        return isPrimes;
    }

    public static void main(String[] args)
    {
        boolean[] isPrimes = countPrimes(97);

        for (int i = 0; i < isPrimes.length; i++) {
            if (isPrimes[i])
                System.out.println(i);
        }
    }
}
