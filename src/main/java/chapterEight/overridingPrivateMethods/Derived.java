package chapterEight.overridingPrivateMethods;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Derived extends PrivateOverride {
    public void f() {
        print("public f()");
    }
}
