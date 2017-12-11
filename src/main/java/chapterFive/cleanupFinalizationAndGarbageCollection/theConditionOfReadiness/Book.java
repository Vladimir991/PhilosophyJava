package chapterFive.cleanupFinalizationAndGarbageCollection.theConditionOfReadiness;

/**
 * Created by Vladimir Glinskikh on 10.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Book {
    boolean checkedOut = false;

    public Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut)
            System.out.println("Error: checkedOut");
    }
}
