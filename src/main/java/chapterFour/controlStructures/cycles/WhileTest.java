package chapterFour.controlStructures.cycles;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 08.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        print(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition())
            print("Inside 'while'");
        print("Exited 'while'");
    }
}
