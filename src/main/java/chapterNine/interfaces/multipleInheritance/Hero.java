package chapterNine.interfaces.multipleInheritance;

/**
 * Created by Vladimir Glinskikh on 17.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {
    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

}
