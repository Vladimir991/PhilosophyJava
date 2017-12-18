package chapterNine.interfaces.interfacesAndFactories;

/**
 * Created by Vladimir Glinskikh on 18.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Implementation1Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation1();
    }
}
