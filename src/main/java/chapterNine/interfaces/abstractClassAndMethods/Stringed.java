package chapterNine.interfaces.abstractClassAndMethods;

import chapterEight.extensibility.Note;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 16.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        print("Stringed.play() " + n);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {

    }
}
