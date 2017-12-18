package chapterNine.interfaces.interfacesAsAMeansOfAdaptation;

import java.util.Random;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 18.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class RandomDoubles {
    private static Random random = new Random(47);

    public double next() {
        return random.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles randomDoubles = new RandomDoubles();
        for (int i = 0; i < 7; i++)
            print(randomDoubles.next() + " ");
    }
}
