package chapterTen.innerClasses.classesInsideInterfaces;

/**
 * Created by Vladimir Glinskikh on 23.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {

        public void howdy() {
            System.out.println("Hello!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
