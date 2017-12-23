package chapterTen.innerClasses.innerClassesInMethodsAndScopes;

import chapterTen.innerClasses.innerClassesAndUpcast.Destination;

/**
 * Created by Vladimir Glinskikh on 23.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Parcel5 {
    public Destination destination(final String s) {
        class PDestination implements Destination {
            private String label;

            public PDestination(String whereTo) {
                this.label = whereTo;
                System.out.println(s);
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination destination = parcel5.destination("Tanzania");

    }
}
