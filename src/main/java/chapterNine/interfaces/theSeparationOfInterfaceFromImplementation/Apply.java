package chapterNine.interfaces.theSeparationOfInterfaceFromImplementation;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 17.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Apply {
    public static void process(Processor p, Object s) {
        print("Use Processor: " + p.name());
        print(p.process(s));
    }
}
