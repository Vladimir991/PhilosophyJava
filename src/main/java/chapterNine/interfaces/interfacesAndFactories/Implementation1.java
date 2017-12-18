package chapterNine.interfaces.interfacesAndFactories;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 18.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Implementation1 implements Service {
    Implementation1() {
    }

    @Override
    public void method1() {
        print("Implementation1 method1");
    }

    @Override
    public void method2() {
        print("Implementation1 method2");
    }
}
