package chapterEleven.stack;

import java.util.LinkedList;

/**
 * Created by Vladimir Glinskikh on 04.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
}
