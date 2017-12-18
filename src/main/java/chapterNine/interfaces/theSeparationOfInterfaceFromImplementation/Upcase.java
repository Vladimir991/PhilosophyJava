package chapterNine.interfaces.theSeparationOfInterfaceFromImplementation;

/**
 * Created by Vladimir Glinskikh on 17.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Upcase extends StringProcessor {
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}
