package chapterEight.inheritingAndCompletingAction;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("croaks!");
    private Description t = new Description("eat beetle");

    public Frog() {
        super();
        print("Frog()");
    }

    @Override
    protected void dispose() {
        print("Complit Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        print("Bye-Bye!");
        frog.dispose();
    }
}
