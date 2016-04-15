package sun.algorithms.sortsearching;

import java.util.Arrays;

/**
 * Created by sun on 07/04/16.
 */
public class LargestNumber
{
    private static String integersToString(int a, int b)
    {
        return String.valueOf(b) + String.valueOf(a);
    }

    public static void main(String[] args)
    {
        Integer[] nums = {3, 30, 34, 5, 9};

        Arrays.sort(nums, (a, b)  -> integersToString(a, b).compareTo(integersToString(b, a)));

        StringBuffer res = new StringBuffer();
        for (int num : nums) {
            res.append(String.valueOf(num));
        }

        System.out.println(res.toString());
    }
}
