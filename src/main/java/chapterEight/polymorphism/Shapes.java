package chapterEight.polymorphism;

/**
 * Created by Vladimir Glinskikh on 13.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Shapes {
    private static RandomShapeGenerator generator =
            new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++)
            s[i] = generator.next();
        for (Shape shape : s)
            shape.draw();
    }
}
