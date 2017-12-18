package chapterNine.interfaces.abstractClassAndMethods;

import chapterEight.extensibility.Note;

/**
 * Created by Vladimir Glinskikh on 16.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public abstract class Instrument {
    private int i;

    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}
