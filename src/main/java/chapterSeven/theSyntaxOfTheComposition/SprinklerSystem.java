package chapterSeven.theSyntaxOfTheComposition;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 12.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "valve1='" + valve1 + '\'' +
                ", valve2='" + valve2 + '\'' +
                ", valve3='" + valve3 + '\'' +
                ", valve4='" + valve4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        print(sprinklerSystem);
    }
}
