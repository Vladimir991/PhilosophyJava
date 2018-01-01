package chapterEleven.basicСoncepts;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Vladimir Glinskikh on 29.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            collection.add(i);
        for (Integer i : collection)
            System.out.print(i + ", ");
    }
}
