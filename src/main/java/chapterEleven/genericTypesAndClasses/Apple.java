package chapterEleven.genericTypesAndClasses;

/**
 * Created by Vladimir Glinskikh on 26.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}
