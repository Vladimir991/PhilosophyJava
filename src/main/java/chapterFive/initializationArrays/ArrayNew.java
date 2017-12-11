package chapterFive.initializationArrays;

import java.util.Arrays;
import java.util.Random;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 11.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ArrayNew {
    public static void main(String[] args) {
        Random random = new Random(47);
        int[] a = new int[random.nextInt(20)];
        print("Length a = " + a.length);
        print(Arrays.toString(a));
    }
}
