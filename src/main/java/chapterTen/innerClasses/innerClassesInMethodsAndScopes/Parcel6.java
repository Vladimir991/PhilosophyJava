package chapterTen.innerClasses.innerClassesInMethodsAndScopes;

/**
 * Created by Vladimir Glinskikh on 23.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                TrackingSlip(String s) {
                    id = s;
                    System.out.println(s);
                }

                String getSlip() {
                    return id;
                }
            }
            TrackingSlip trackingSlip = new TrackingSlip("slip");
            String s = trackingSlip.getSlip();
        }
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        parcel6.track();
    }
}
