package chapterSeven.ensuringTheCorrectCompletion;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 13.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Shape {
    Shape(int i) {
        print("Constructor Shape.");
    }

    void dispose() {
        print("The end Shape.");
    }
}
