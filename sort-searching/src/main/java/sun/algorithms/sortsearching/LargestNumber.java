package sun.algorithms.sortsearching;

import java.util.Arrays;

/**
 * Created by sun on 07/04/16.
 */
public class LargestNumber
{
    private static String integersToString(Integer a, Integer b)
    {
        return b.toString() + a.toString();
    }

    public static void main(String[] args)
    {
        int[] aa = {3, 30, 34, 5, 9};
        Integer[] nums = new Integer[aa.length];
        for (int i = 0; i<aa.length; i++) {
            nums[i] = aa[i];
        }

        Arrays.sort(nums, (a, b)  -> integersToString(a, b).compareTo(integersToString(b, a)));

        StringBuffer res = new StringBuffer();
        for (int num : nums) {
            res.append(String.valueOf(num));
        }

        System.out.println(res.toString());
    }
}
