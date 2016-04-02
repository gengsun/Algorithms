package sun.algorithms.sortsearching;

import java.util.*;

/**
 * Created by sun on 01/04/16.
 */
public class SortAnagrams
{
    public static void sortAnagrams(String[] words)
    {
        HashMap<String, LinkedList<String>> buffer = new HashMap<>();

        for (String word : words)
        {
            String key = sortWord(word);

            if (!buffer.containsKey(key))
                buffer.put(key, new LinkedList<>());

            LinkedList<String> anagrams = buffer.get(key);
            anagrams.push(word);
        }

        final int[] index = {0};
        buffer.forEach((k, v) -> v.forEach(word -> words[index[0]++] = word));
    }

    private static String sortWord(String s)
    {
        char[] word = s.toCharArray();
        Arrays.sort(word);
        return new String(word);
    }

    public static void main(String[] args)
    {
        String[] words = {"cheng", "ozgn", "sun", "nus", "zong", "enchg", "usn"};

        sortAnagrams(words);

        // Lambda in-place sorting but takes nlg(n) time
        Arrays.sort(words, (s1, s2) -> sortWord(s1).compareTo(sortWord(s2)));

        for (String word : words) {
            System.out.println(word);
        }
    }
}
