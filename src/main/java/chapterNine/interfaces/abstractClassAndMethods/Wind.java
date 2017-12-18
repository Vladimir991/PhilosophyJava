package chapterNine.interfaces.abstractClassAndMethods;

import chapterEight.extensibility.Note;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 16.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        print("Wind.play() " + n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }
}
