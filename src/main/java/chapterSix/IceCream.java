package chapterSix;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 12.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class IceCream {
    public static void main(String[] args) {
        //Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
        print(x);
    }
}
