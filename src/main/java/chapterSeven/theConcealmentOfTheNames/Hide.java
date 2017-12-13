package chapterSeven.theConcealmentOfTheNames;

/**
 * Created by Vladimir Glinskikh on 13.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
