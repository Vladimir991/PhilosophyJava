package chapterEight.behaviorOfPolymorphicMethods;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 15.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Glyph {
    void draw() {
        print("Glyph.draw()");
    }

    public Glyph() {
        print("Glyph() before calling the draw()");
        draw();
        print("Glyph() after calling the draw()");
    }
}
