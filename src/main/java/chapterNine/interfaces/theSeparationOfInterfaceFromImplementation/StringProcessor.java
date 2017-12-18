package chapterNine.interfaces.theSeparationOfInterfaceFromImplementation;

/**
 * Created by Vladimir Glinskikh on 17.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    public static String s =
            "If she weighs the same as a duck, she's made of wood.";


    @Override
    public abstract Object process(Object input);

    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
    }
}
