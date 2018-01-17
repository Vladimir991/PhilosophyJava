package chapterEleven.priorityQueue;

import chapterEleven.queue.QueueDemo;

import java.util.*;

/**
 * Created by Vladimir Glinskikh on 11.01.2018.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++)
            priorityQueue.offer(random.nextInt(i + 10));
        QueueDemo.printQ(priorityQueue);

        List<Integer> integers = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(integers);
        QueueDemo.printQ(priorityQueue);
        priorityQueue = new PriorityQueue<>(integers.size(), Collections.reverseOrder());
        priorityQueue.addAll(integers);
        QueueDemo.printQ(priorityQueue);
        System.out.println(" ");

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
        QueueDemo.printQ(stringPQ);
        stringPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);
        System.out.println(" ");

        Set<Character> charSet = new HashSet<>();
        for (char c : fact.toCharArray())
            charSet.add(c);
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
        QueueDemo.printQ(characterPQ);
        System.out.println(" ");
    }
}
