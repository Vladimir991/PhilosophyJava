package chapterEleven.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by Vladimir Glinskikh on 10.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i + 10));
            printQ(queue);
        }
        Queue<Character> characterQueue = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray()) {
            characterQueue.offer(c);
            printQ(characterQueue);
        }
    }

    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
    }
}
