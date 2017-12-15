package chapterEight.rtti;

/**
 * Created by Vladimir Glinskikh on 15.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].g();
        //x[2].u();
//        ((MoreUseful) x[1].u);
//        ((MoreUseful) x[0].u);
    }
}
