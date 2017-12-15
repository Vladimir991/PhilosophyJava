package chapterEight.polymorphism;

import static util.print.Print.print;
import static util.print.Print.printt;

/**
 * Created by Vladimir Glinskikh on 13.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Square extends Shape {
    @Override
    public void draw() {
        super.draw();
        print("Square.draw()");
    }

    @Override
    public void erase() {
        super.erase();
        printt("Square.erase()");
    }
}
