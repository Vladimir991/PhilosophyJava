package chapterEleven.genericTypesAndClasses;

import java.util.ArrayList;

/**
 * Created by Vladimir Glinskikh on 28.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for (Apple c : apples)
            System.out.println(c);
    }
}
