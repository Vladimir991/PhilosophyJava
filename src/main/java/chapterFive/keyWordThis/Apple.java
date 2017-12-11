package chapterFive.keyWordThis;

/**
 * Created by Vladimir Glinskikh on 09.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Apple {
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
