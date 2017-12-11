package chapterFive.overloadMethods;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 09.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Tree {
    int height;

    public Tree() {
        print("Plant a sprout of the tree.");
        height = 0;
    }

    public Tree(int height) {
        this.height = height;
        print("Create new tree height " + height + " M.");
    }

    void info() {
        print("Tree height " + height + " M.");
    }

    void info(String s) {
        print(s + ": Tree height " + height + " M.");
    }
}
