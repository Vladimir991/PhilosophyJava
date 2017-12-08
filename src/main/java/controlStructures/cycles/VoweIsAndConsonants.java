package controlStructures.cycles;

import java.util.Random;

import static print.Print.*;

/**
 * Created by Vladimir Glinskikh on 08.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class VoweIsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            printnb((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    print("Vowel");
                    break;
                case 'y':
                case 'w':
                    print("Conventionally vowel");
                    break;
                default:
                    print("Consonant");
            }
        }
    }
}
