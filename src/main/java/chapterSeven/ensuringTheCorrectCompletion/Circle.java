package chapterSeven.ensuringTheCorrectCompletion;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 13.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Circle extends Shape {
    Circle(int i) {
        super(i);
        print("Drawing circle Circle.");
    }

    void dispose() {
        print("Erase circle Circle.");
        super.dispose();
    }
}
