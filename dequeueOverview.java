import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class dequeueOverview {
    public static void main(String[] args){
        ArrayDeque<Integer> deque = new ArrayDeque<>();//16 by default same as hashset
        deque.add(5);
        deque.add(76);
        deque.add(12);
        System.out.println(deque);
        System.out.println(deque.size());

        deque.remove();
        System.out.println(deque);

        deque.addFirst(89);
        System.out.println(deque);

        System.out.println("first element:"+deque.getFirst());
        System.out.println("last element:"+deque.getLast());

        //dequeue is just a queue with insertion&deletion happening at both ends
        //follows FIFO
    }
}