package sun.algorithms.recursive;

/**
 * Created by sun on 19/04/16.
 */
public class TowerOfHanoi
{
    public static void move(int n, int origin, int buffer, int dest)
    {
        if (n == 1)
        {
            System.out.println("Move " + n + " from " + origin + " to " + dest);
            return;
        }

        move(n - 1, origin, dest, buffer);
        System.out.println("Move " + n + " from " + origin + " to " + dest);
        move(n - 1, buffer, origin, dest);
    }

    public static void main(String[] args)
    {
        move(3, 1, 2, 3);
    }
}
