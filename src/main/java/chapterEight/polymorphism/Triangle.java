package chapterEight.polymorphism;

import static util.print.Print.print;
import static util.print.Print.printt;

/**
 * Created by Vladimir Glinskikh on 13.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        super.draw();
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        super.erase();
        printt("Triangle.erase()");
    }
}
