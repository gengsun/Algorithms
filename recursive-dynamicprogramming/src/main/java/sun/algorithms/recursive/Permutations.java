package sun.algorithms.recursive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sun on 04/04/16.
 */
public class Permutations
{
    public static List<String> getPermutations(String s)
    {
        List<String> res = new LinkedList<>();
        res.add("");

        for (int i = 0; i < s.length(); i++)
        {
            List<String> prev = new ArrayList<>(res);
            res.clear();

            char c = s.charAt(i);
            prev.forEach(str -> {
                for (int j = 0; j <= str.length(); j++) {
                    res.add(insertAt(j, c, str));
                }
            });
        }

        return res;
    }

    public static List<String> getPermutationsRecursive(String s, int index)
    {
        List<String> res = new ArrayList<>();

        if (index == 0)
        {
            res.add("");
            return res;
        }

        List<String> prev = getPermutationsRecursive(s, --index);
        char c = s.charAt(index);
        prev.forEach(str -> {
            for (int i = 0; i <= str.length(); i++)
                res.add(insertAt(i, c, str));
        });

        return res;
    }

    private static String insertAt(int index, char c, String s)
    {
        String left = s.substring(0, index);
        String right = s.substring(index);
        return left + c + right;
    }

    public static void main(String[] args)
    {
        String s = "baozi";

        List<String> perms = getPermutations(s);
        perms.forEach(System.out::println);

        List<String> permsR = getPermutationsRecursive(s, s.length());
        permsR.forEach(System.out::println);
    }
}
