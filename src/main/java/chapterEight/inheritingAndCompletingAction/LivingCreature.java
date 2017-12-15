package chapterEight.inheritingAndCompletingAction;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class LivingCreature {
    private Characteristic p = new Characteristic("a living creature");
    private Description t = new Description("an ordinary living entity");

    public LivingCreature() {
        print("LivingCreature()");
    }

    protected void dispose() {
        print("dispose() in LivingCreature ");
        t.dispose();
        p.dispose();
    }
}
