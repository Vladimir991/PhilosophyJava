package chapterEleven.stack;

/**
 * Created by Vladimir Glinskikh on 04.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class StackCollision {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has files".split(" "))
            stack.push(s);
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
        System.out.println();
        Stack<String> stack2 = new Stack<>();
        for (String s : "My dog has fleas".split(" "))
            stack2.push(s);
        while (!stack2.empty())
            System.out.print(stack2.pop() + " ");
    }
}
