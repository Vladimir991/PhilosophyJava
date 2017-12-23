package chapterTen.innerClasses.linkToExternalClass;

/**
 * Created by Vladimir Glinskikh on 20.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public interface Selector {
    boolean end();

    Object current();

    void next();
}
