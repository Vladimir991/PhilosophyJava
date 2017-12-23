package chapterTen.innerClasses.anonymousAndInnerClasses;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 23.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public abstract class Base {
    public Base(int i) {
        print("Base constructor, i = " + i);
    }

    public abstract void f();
}
