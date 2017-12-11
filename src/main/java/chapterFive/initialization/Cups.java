package chapterFive.initialization;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 11.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Cups {
    static Cup cup1;

    static {
        cup1 = new Cup(1);
        cup1 = new Cup(2);
        cup1 = new Cup(3);
    }

    Cups() {
        print("Cups()");
    }
}
