package chapterFive.overloadMethods;

/**
 * Created by Vladimir Glinskikh on 09.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("This is Overload method.");
        }
        new Tree();
    }
}
