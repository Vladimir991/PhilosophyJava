package chapterSeven.theCombinationOfCompositionAndInheritance;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 13.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Knife extends Utensil {
    Knife(int i) {
        super(i);
        print("Constructor Knife.");
    }
}
