import java.util.Arrays;

public class GenericStack<E> {
    private E[] elems;
    private int size = 10;

    public GenericStack(){
        elems = (E[]) new Object[size];
    }
    public GenericStack(int setSize) {
        size = setSize;
        elems = (E[]) new Object[size];
    }
    public int getSize() {
        return size;
    }
    public E peek() {
        if (isEmpty()) return null;
        return elems[size - 1];
    }
    public void push(E o) {
        if (size == elems.length) {
            E[] temp = elems;
            elems = (E[]) new Object[size * 2];
            elems = Arrays.copyOf(temp, size * 2);
        }
        elems[size++] = o;
    }
    public E pop() {
        if (isEmpty()) return null;
        E o = elems[size - 1];
        elems[size] = null;
        return o;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(elems[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
