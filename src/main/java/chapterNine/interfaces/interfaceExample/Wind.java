package chapterNine.interfaces.interfaceExample;

import chapterEight.extensibility.Note;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 17.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Wind implements Instrument {
    @Override
    public void play(Note n) {
        print(this + " .play() " + n);
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Wind{}";
    }
}
