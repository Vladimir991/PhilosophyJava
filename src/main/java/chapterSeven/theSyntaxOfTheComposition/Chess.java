package chapterSeven.theSyntaxOfTheComposition;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 12.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        print("Constructor Chess.");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
