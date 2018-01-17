package chapterEleven.set;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Vladimir Glinskikh on 10.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        SortedSet<Integer> integers = new TreeSet<>();
        for (int i = 0; i < 10000; i++) {
            integers.add(random.nextInt(30));
            System.out.println(integers);
        }
    }
}
