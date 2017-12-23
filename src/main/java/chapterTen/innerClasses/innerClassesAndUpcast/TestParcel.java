package chapterTen.innerClasses.innerClassesAndUpcast;

/**
 * Created by Vladimir Glinskikh on 23.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4();
        Contents contents = parcel4.contents();
        Destination destination = parcel4.destination("Tanzania");

    }
}
