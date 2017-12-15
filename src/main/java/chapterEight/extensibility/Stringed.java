package chapterEight.extensibility;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Stringed extends Instrument {
    @Override
    void play(Note n) {
        super.play(n);
        print("Stringed.play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        super.adjust();
        print("Adjusting Stringed");
    }
}
