package chapterEight.covarianceOfReturnTypes;

/**
 * Created by Vladimir Glinskikh on 15.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
}
