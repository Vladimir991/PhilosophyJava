package chapterNine.interfaces.interfaceExample;

import chapterEight.extensibility.Note;

/**
 * Created by Vladimir Glinskikh on 17.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public interface Instrument {
    int VALUE = 5;

    void play(Note n);

    void adjust();
}
