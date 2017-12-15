package chapterEight.inheritingAndCompletingAction;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has a heart");
    private Description t = new Description("Animal, not plants");

    public Animal() {
        super();
        print("Animal()");
    }

    @Override
    protected void dispose() {
        super.dispose();
        print("dispose() in Animal ");
        t.dispose();
        p.dispose();
    }
}
