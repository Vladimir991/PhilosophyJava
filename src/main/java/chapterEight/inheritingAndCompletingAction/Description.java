package chapterEight.inheritingAndCompletingAction;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Description {
    private String s;

    public Description(String s) {
        this.s = s;
        print("Create Description " + s);
    }

    protected void dispose() {
        print("Complit Description " + s);
    }
}
