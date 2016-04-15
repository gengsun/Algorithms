package sun.algorithms.sortsearching;

/**
 * Created by sun on 05/04/16.
 */
public class BinarySearch
{
    public static int binarySearch(int[] nums, int target)
    {
        int low = 0, high = nums.length - 1;

        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (nums[mid] < target)
                low = mid + 1;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                return mid;
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] a, int target, int low, int high)
    {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;
        if (a[mid] < target)
            return binarySearchRecursive(a, target, mid + 1, high);
        else if (a[mid] > target)
            return binarySearchRecursive(a, target, low, mid - 1);
        else
            return mid;
    }

    public static int findFirstOne(int[] a)
    {
        int low = 0, high = a.length - 1;

        if (a[low] == 1 || a[high] == 0) {
            throw new RuntimeException("Invalid input array...");
        }

        while (low <= high)
        {
            int res = (low + high) / 2;
            if (a[res] + a[res + 1] == 1)
                return res + 1;
            else if (a[res] + a[res + 1] == 0)
                low = res + 1;
            else
                high = res - 1;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(binarySearch(nums, 0));
        System.out.println(binarySearchRecursive(nums, 5, 0, nums.length - 1));

        int[] a = {0, 0, 1};
        System.out.println(findFirstOne(a));
    }
}
