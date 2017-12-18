package chapterNine.interfaces.theSeparationOfInterfaceFromImplementation;

import java.util.Arrays;

/**
 * Created by Vladimir Glinskikh on 17.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Splitter extends StringProcessor {
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
