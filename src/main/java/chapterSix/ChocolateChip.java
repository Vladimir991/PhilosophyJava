package chapterSix;

import static util.print.Print.print;

/**
 * Created by Vladimir Glinskikh on 12.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        print("Constructor ChocolateChip.");
    }
    public void chomp(){
        //bite();
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
