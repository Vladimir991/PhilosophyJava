package chapterTen.innerClasses.anonymousAndInnerClasses;

/**
 * Created by Vladimir Glinskikh on 23.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Wrapping {
    private int i;

    public Wrapping(int x) {
        i = x;
        System.out.println(x);
    }

    public int value() {
        return i;
    }
}
