package chapterSeven.ensuringTheCorrectCompletion;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 13.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        print("Drawing triangle Triangle.");
    }

    void dispose() {
        print("Erase triangle Triangle.");
        super.dispose();
    }
}
