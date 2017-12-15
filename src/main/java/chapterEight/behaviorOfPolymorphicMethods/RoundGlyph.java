package chapterEight.behaviorOfPolymorphicMethods;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 15.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}
