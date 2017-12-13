package chapterSeven.compositionComparedToInheritance;

import static util.print.Print.print;
import static util.print.Print.printt;

/**
 * Created by Vladimir Glinskikh on 13.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }

    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        print(orc);
        orc.change("Bob", 19);
        printt(orc);
    }
}
