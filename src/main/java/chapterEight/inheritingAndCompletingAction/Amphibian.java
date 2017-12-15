package chapterEight.inheritingAndCompletingAction;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Amphibian extends Animal {
    private Characteristic p = new Characteristic("have live in water");
    private Description t = new Description("can live in water and on earth");

    public Amphibian() {
        super();
        print("Amphibian()");
    }

    @Override
    protected void dispose() {
        super.dispose();
        print("dispose() in Amphibian ");
        t.dispose();
        p.dispose();
    }
}
