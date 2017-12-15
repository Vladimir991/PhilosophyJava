package chapterEight.extensibility;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Brass extends Wind {
    @Override
    void adjust() {
        super.adjust();
        print("Adjusting Brass");
    }

    @Override
    void play(Note n) {
        super.play(n);
        print("Brass.play()" + n);
    }
}
