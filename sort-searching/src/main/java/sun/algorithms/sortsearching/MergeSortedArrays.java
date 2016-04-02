package sun.algorithms.sortsearching;

/**
 * Created by sun on 02/04/16.
 */
public class MergeSortedArrays
{
    public static void mergeArrays(int[] a, int m, int[] b, int n)
    {
        long total = m + n - 1;
        int lastA = m - 1, lastB = n - 1;
        
        while (lastB >= 0)
        {
            if (lastA >= 0 && a[lastA] >= b[lastB])
                a[(int) total--] = a[lastA--];
            else
                a[(int) total--] = b[lastB--];
                
        }
    }
    
    public static void main(String[] args)
    {
        int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
        int[] b = {1, 4, 6, 6, 7, 7};

        mergeArrays(a, 8, b, 6);

        for (int num : a) {
            System.out.println(num);
        }
    }
}
