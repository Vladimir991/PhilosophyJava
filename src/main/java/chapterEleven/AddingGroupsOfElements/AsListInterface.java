package chapterEleven.AddingGroupsOfElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vladimir Glinskikh on 29.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class AsListInterface {
    public static void main(String[] args) {
        List<Snow> snows = Arrays.asList(
                new Crusty(),
                new Slush(),
                new Powder());

        //не откомпилируется
        List<Snow> snows1 = Arrays.asList(
                new Light(),
                new Heavy());
        //компилятор сообщает:
        //получено: java.util.List<Powder>
        //требуется: java.util.List<Snow>
        //у Collections.addAll() нет проблем:
        List<Snow> snows2 = new ArrayList<>();
        Collections.addAll(
                snows2,
                new Light(),
                new Heavy());

        //подсказка с явно указанным аргументом типа:
//        List<Snow> snows3 = Arrays.asList(
//                new Light(),
//                new Heavy());

        System.out.println(snows);
        System.out.println(snows1);
        System.out.println(snows2);
        //System.out.println(snows3);
    }
}
