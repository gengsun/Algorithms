package sun.algorithms.recursive;

/**
 * Created by sun on 16/04/16.
 */
public class BestTimeToBuySellStock
{
    public static void getBuySellTimeWithOneTransaction(int[] n)
    {
        int max = 0, sum = 0;
        int buy = 0, sell = 0, tmp = 0;

        for (int i = 0; i < n.length; i++)
        {
            if (sum + n[i] <= 0)
            {
                sum = 0;
                tmp = i + 1;
            }
            else sum += n[i];

            if (max < sum)
            {
                max = sum;
                buy = tmp;
                sell = i;
            }
        }

        System.out.println("Buy at day " + buy + ", and sell at day " + sell + ", with the maximum profit of " + max);
    }

    public static void main(String[] args)
    {
        int[] n = {2, -8, 3, -2, 4, -10};
        getBuySellTimeWithOneTransaction(n);
    }
}
