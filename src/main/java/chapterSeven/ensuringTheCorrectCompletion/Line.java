package chapterSeven.ensuringTheCorrectCompletion;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 13.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Line extends Shape {
    private int start, end;

    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        print("Drawing line Line: " + start + ", " + end);
    }

    void dispose() {
        print("Erase line Line: " + start + ", " + end);
        super.dispose();
    }
}
