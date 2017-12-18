package chapterNine.interfaces.nestedInterfaces;

/**
 * Created by Vladimir Glinskikh on 18.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public interface E {
    interface G {
        void f();
    }

    interface H {
        void f();
    }

    void g();
}
