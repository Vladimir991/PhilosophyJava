package chapterThree.operators.combination;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 07.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);
        print("2: x.c: " + x.c);
    }
}
