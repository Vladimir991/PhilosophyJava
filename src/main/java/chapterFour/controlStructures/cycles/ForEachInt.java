package chapterFour.controlStructures.cycles;

import static util.range.Range.*;
import static util.print.Print.*;

/**
 * Created by Vladimir Glinskikh on 08.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ForEachInt {
    public static void main(String[] args) {
        for (int i : range(10))
            printnb(i + " ");
        print();
        for (int i : range(5, 10))
            printnb(i + " ");
        print();
        for (int i : range(5, 20, 3))
            printnb(i + " ");
        print();
    }
}
