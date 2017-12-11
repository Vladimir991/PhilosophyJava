package chapterFive.initializationArrays;

import java.util.Arrays;
import java.util.Random;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 11.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        print("Lenght a = " + a.length);
        for (int i = 0; i < a.length; i++)
            a[i] = random.nextInt(500);
        print(Arrays.toString(a));
    }
}
