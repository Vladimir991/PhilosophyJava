package chapterEight.theOrderOfInvocationOfConstructors;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        super();
        print("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
