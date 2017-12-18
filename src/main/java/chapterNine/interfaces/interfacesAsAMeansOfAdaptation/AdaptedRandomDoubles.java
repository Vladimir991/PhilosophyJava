package chapterNine.interfaces.interfacesAsAMeansOfAdaptation;

import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by Vladimir Glinskikh on 18.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    public int read(CharBuffer charBuffer) {
        if (count-- == 0)
            return -1;
        String result = Double.toString(next()) + " ";
        charBuffer.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new AdaptedRandomDoubles(7));
        while (scanner.hasNextDouble())
            System.out.println(scanner.nextDouble() + " ");
    }
}
