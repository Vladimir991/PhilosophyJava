package chapterNine.interfaces.abstractClassAndMethods;

import chapterEight.extensibility.Note;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 16.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        print("Percussion.play() " + n);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {

    }
}
