import java.util.LinkedList;
import java.util.Queue;
// comments written in english to prevent on-fly reading by others
public class StackOnQueue<E>{
    private Queue<E> queue1 = new LinkedList<>();
    private Queue<E> queue2 = new LinkedList<>();


    public void push(E x) {
        queue2.add(x);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        Queue<E> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    public E pop() {
        return queue1.poll();
    }
    public E top() {
        return queue1.peek();
    }
    public boolean empty() {
        return queue1.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (E cur : queue1) {
            result.append(cur).append(" ");
        }
        return result.toString();
    }
}

