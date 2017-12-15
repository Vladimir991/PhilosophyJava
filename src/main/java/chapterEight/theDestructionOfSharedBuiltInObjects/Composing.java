package chapterEight.theDestructionOfSharedBuiltInObjects;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        print("Create " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        print("disposing " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }
}
