package sun.algorithms.arraystring;

/**
 * Created by sun on 09/04/16.
 */
public class PermutationPalindrome
{
    public static boolean isPermutationPalindrome(String s)
    {
        int[] count = new int[128];
        int odd = 0;

        for (int i = 0; i < s.length(); i++)
        {
            count[s.charAt(i)]++;

            if (count[s.charAt(i)] % 2 == 1)
                odd++;
            else
                odd--;
        }

        return odd <= 1;
    }

    public static void main(String[] args)
    {
        String s = "acb";
        System.out.println(isPermutationPalindrome(s));
    }
}
