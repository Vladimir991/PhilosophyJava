package operators.ternaryOperator;

import static print.Print.print;

/**
 * Created by Vladimir Glinskikh on 07.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class TernaryIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int standartIfElse(int i) {
        if (i < 10)
            return i * 100;
        else
            return i * 10;
    }

    public static void main(String[] args) {
        print(ternary(9));
        print(ternary(10));
        print(standartIfElse(9));
        print(standartIfElse(10));
    }
}
