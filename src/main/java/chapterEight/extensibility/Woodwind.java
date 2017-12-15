package chapterEight.extensibility;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Woodwind extends Wind {
    @Override
    String what() {
        return "Woodwind";
    }

    @Override
    void play(Note n) {
        super.play(n);
        print("Woodwind.play()" + n);
    }
}
