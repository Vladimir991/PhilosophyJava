package chapterTwo.everythingIsAnObject.exercises;

/**
 * Created by Vladimir Glinskikh on 06.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class NumberThree {
    public static void main(String[] args) {
        ATypeName a = new ATypeName();
        a.print();
    }

    public static class ATypeName {
        void print() {
            System.out.println("Выполнено третье задание.");
        }
    }
}
