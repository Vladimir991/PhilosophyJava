package chapterEight.polymorphism;

import static util.print.Print.print;
import static util.print.Print.printt;

/**
 * Created by Vladimir Glinskikh on 13.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Circle extends Shape {
    public void draw() {
        print("Circle.draw()");
    }

    public void erase() {
        printt("Circle.erase()");
    }
}
