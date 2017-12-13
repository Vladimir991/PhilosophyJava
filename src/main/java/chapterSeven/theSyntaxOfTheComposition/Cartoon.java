package chapterSeven.theSyntaxOfTheComposition;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 12.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Cartoon extends Drawing {
    public Cartoon() {
        print("Constructor Cartoon");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
