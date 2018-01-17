package chapterEleven.stack;

/**
 * Created by Vladimir Glinskikh on 04.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
