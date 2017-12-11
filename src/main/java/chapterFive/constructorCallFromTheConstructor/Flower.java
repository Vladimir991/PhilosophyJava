package chapterFive.constructorCallFromTheConstructor;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 09.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        print("Constructor with value int, petalCount = "
                + petalCount);
    }

    Flower(String ss) {
        print("Constructor with value String, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        print("Arguments String and int");
    }

    Flower() {
        this("hi", 47);
        print("Constructor at default(no arguments)");
    }

    void printPetalCount() {
        print("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
