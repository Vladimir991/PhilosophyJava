package chapterEight.inheritingAndCompletingAction;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Characteristic {
    private String s;

    public Characteristic(String s) {
        this.s = s;
        print("Create Characteristic " + s);
    }

    protected void dispose() {
        print("Complit Characteristic " + s);
    }
}
