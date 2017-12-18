package chapterNine.interfaces.theSeparationOfInterfaceFromImplementation;

/**
 * Created by Vladimir Glinskikh on 17.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public interface Processor {
    String name();

    Object process(Object input);
}
