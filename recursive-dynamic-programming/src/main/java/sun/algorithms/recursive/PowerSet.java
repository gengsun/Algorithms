package sun.algorithms.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sun on 04/04/16.
 */
public class PowerSet
{
    public static List<List<Integer>> getPowerSet(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums)
        {
            List<List<Integer>> newSet = addItemToSet(num, result);
            result.addAll(newSet);
        }

        return result;
    }

    public static List<List<Integer>> getPowerSetRecursive(int[] nums, int remainder)
    {
        if (remainder == 0)
        {
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>());
            return res;
        }

        List<List<Integer>> prev = getPowerSetRecursive(nums, --remainder);
        List<List<Integer>> newSet = addItemToSet(nums[remainder], prev);
        prev.addAll(newSet);
        return prev;
    }

    private static List<List<Integer>> addItemToSet(int item, List<List<Integer>> prev)
    {
        List<List<Integer>> newSet = new ArrayList<>();

        prev.forEach(l -> {
            List<Integer> newList = new ArrayList<>();
            newList.addAll(l);
            newList.add(item);
            newSet.add(newList);
        });

        return newSet;
    }

    private static void print(List<Integer> list)
    {
        list.forEach(item -> System.out.print(item + ", "));
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] nums = {2, 3, 1};
        Arrays.sort(nums);

        List<List<Integer>> powerSet = getPowerSet(nums);
        powerSet.forEach(PowerSet::print);

        powerSet = getPowerSetRecursive(nums, nums.length);
        powerSet.forEach(PowerSet::print);
    }
}
