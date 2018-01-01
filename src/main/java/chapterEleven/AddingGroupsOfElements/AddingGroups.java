package chapterEleven.AddingGroupsOfElements;

import java.util.*;

/**
 * Created by Vladimir Glinskikh on 29.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        // работает быстрее, но Collection
        // так сделать невозможно
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        //создаем список на базе массива
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        //list.add(21);
        System.out.println(list);
        System.out.println(collection);
    }
}
