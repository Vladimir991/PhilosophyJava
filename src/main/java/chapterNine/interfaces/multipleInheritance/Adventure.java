package chapterNine.interfaces.multipleInheritance;

/**
 * Created by Vladimir Glinskikh on 17.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
