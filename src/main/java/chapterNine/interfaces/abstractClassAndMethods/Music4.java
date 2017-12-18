package chapterNine.interfaces.abstractClassAndMethods;

import chapterEight.extensibility.Note;

/**
 * Created by Vladimir Glinskikh on 16.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Music4 {
    static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
