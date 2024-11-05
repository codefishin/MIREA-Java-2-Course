import java.util.ArrayList;

public class MyStackSequel<O> extends ArrayList<O> {
    private ArrayList<O> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() { return list.size(); }

    public O peek() { return list.get(getSize() - 1); }

    public O pop() {
        O obj = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return obj;
    }

    public void push(O Object){
        list.add(Object);
    }
}
