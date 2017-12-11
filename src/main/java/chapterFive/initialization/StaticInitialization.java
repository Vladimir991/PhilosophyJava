package chapterFive.initialization;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 10.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class StaticInitialization {
    public static void main(String[] args) {
        print("Create new Object Cupboard in main()");
        new Cupboard();
        print("Create new Object Cupboard in main()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
