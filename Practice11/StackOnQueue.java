import java.util.LinkedList;
import java.util.Queue;
// comments written in english to prevent on-fly reading by others
public class StackOnQueue<E> {
    private Queue<E> qArr = new LinkedList<E>();
    // queue is an interface, so to initialize it we will need to use LinkedList

    public void push(E nVar) {
        qArr.add(nVar);
    } // adds data to stack

    public E pop() {
        return qArr.poll();
    }  // returns and removes the head of the stack
    // no need to check for queue emptiness, due to .poll() method checking it for us

    public E top() {
        return qArr.peek();
    }

    public boolean empty() {
        return qArr.isEmpty();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (E cur : qArr) {
            result.append(cur).append(" ");
        }
        return result.toString();
    }
}
