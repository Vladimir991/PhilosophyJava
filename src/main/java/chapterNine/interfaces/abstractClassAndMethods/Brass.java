package chapterNine.interfaces.abstractClassAndMethods;

import chapterEight.extensibility.Note;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 16.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Brass extends Wind {
    @Override
    public void play(Note n) {
        print("Brass.play() " + n);
    }

    @Override
    public void adjust() {
        print("Brass.adjust()");
    }
}
