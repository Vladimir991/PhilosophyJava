package chapterTen.innerClasses.anonymousAndInnerClasses;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 23.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                print("In initialization type");
            }

            public void f() {
                print("In anonimous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
