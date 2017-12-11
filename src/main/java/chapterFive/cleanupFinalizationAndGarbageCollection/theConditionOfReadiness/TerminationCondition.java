package chapterFive.cleanupFinalizationAndGarbageCollection.theConditionOfReadiness;

/**
 * Created by Vladimir Glinskikh on 10.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
