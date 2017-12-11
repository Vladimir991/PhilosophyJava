package chapterFive.initialization;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 10.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Bowl {
    Bowl(int marker) {
        print("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        print("f1(" + marker + ")");
    }
}
