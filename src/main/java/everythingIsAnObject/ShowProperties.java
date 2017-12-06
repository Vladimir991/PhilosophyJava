package everythingIsAnObject;

/**
 * Created by Vladimir Glinskikh on 06.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(
                System.getProperty("java.library.path")
        );
    }
}
