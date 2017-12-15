package chapterEight.theDestructionOfSharedBuiltInObjects;

/**
 * Created by Vladimir Glinskikh on 14.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };
        for (Composing c : composings)
            c.dispose();
    }
}
