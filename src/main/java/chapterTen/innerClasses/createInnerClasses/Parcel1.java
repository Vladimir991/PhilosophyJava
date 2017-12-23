package chapterTen.innerClasses.createInnerClasses;

/**
 * Created by Vladimir Glinskikh on 18.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Parcel1 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tanzania");
    }

    private void ship(String dest) {
        Contents c = new Contents();
        Distination d = new Distination(dest);
        System.out.println(d.readLabel());
    }

    private class Distination {
        private String label;

        Distination(String whereTo) {
            this.label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }
}
