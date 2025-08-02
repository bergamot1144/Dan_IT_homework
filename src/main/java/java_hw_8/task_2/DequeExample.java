package java_hw_8.task_2;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class DequeExample {
    public static void main(String[] args) {
        Deque<String>deq = new LinkedList<>();
        deq.addFirst("First");
        deq.addLast("Middle");
        deq.addLast("Last");
        System.out.println(deq);

        System.out.println("First: = "+deq.getFirst());
        System.out.println("Last = "+deq.getLast());

        deq.remove("Middle");
        System.out.println("Remove middle = "+deq);

        deq.push("One");
        deq.push("Two");
        System.out.println("After push"+deq);
        deq.pop();
        System.out.println("After pop "+deq);
    }
}
