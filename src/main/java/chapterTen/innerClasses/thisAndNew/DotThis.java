package chapterTen.innerClasses.thisAndNew;

/**
 * Created by Vladimir Glinskikh on 21.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        DotThis.Inner dtInner = dotThis.inner();
        dtInner.outer().f();
    }
}
