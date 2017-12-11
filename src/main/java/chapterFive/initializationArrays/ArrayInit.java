package chapterFive.initializationArrays;

import java.util.Arrays;

/**
 * Created by Vladimir Glinskikh on 11.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                3, 4, 5
        };
        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
                3, 4, 5
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
