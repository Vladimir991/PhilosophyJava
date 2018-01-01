package chapterEleven.conclusionContainers;

import java.util.*;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 29.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("крыса");
        collection.add("кошка");
        collection.add("собака");
        collection.add("собака");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("крыса", "Анфиса");
        map.put("кошка", "Мурка");
        map.put("собака", "Шарик");
        map.put("собака", "Бобик");
        return map;
    }

    public static void main(String[] args) {
        print(fill(new ArrayList<>()));
        print(fill(new LinkedList<>()));
        print(fill(new HashSet<>()));
        print(fill(new TreeSet<>()));
        print(fill(new LinkedHashSet<>()));
        print(fill(new HashMap<>()));
        print(fill(new TreeMap<>()));
        print(fill(new LinkedHashMap<>()));
    }
}
