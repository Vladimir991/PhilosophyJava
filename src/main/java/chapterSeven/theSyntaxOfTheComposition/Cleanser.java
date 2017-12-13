package chapterSeven.theSyntaxOfTheComposition;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 12.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilure() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return "Cleanser{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilure();
        x.apply();
        x.scrub();
        print(x);
    }
}
