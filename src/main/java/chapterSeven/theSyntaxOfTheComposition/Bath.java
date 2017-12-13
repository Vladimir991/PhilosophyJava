package chapterSeven.theSyntaxOfTheComposition;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 12.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Bath {
    private String
            s1 = "happy",
            s2 = "happy",
            s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        print("In constructor Bath()");
        s3 = "happy";
        toy = 3.14f;
        castille = new Soap();
    }

    {
        i = 47;
    }

    @Override
    public String toString() {
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castille=" + castille +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        print(b);
    }
}
