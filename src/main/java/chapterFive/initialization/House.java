package chapterFive.initialization;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 10.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class House {
    Window w1 = new Window(1);

    House() {
        print("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        print("f()");
    }

    Window w3 = new Window(3);
}
