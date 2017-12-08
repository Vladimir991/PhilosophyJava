package controlStructures.cycles;

import static print.Print.print;

/**
 * Created by Vladimir Glinskikh on 08.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++)
            if (Character.isLowerCase(c))
                print("value: " + (int) c + " symbol: " + c);
    }
}
