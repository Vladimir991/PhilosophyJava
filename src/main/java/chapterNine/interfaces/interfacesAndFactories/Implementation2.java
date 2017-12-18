package chapterNine.interfaces.interfacesAndFactories;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 18.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Implementation2 implements Service {
    Implementation2() {

    }

    @Override
    public void method1() {
        print("Implementation2 method1");
    }

    @Override
    public void method2() {
        print("Implementation2 method2");
    }
}
