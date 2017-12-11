package chapterFive.initializationArrays;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 11.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a2.length; i++)
            a2[i] = a2[i] + 1;
        for (int i = 0; i < a1.length; i++)
            print("a1[" + i + "] = " + a1[i]);
    }
}
