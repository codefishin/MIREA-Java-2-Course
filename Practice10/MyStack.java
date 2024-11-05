import java.util.ArrayList;
// Перепишите ĸласс MyStack
// для выполнения глубоĸой
// ĸопии поля списĸа
public class MyStack<O> implements Cloneable, Comparable<ArrayList<O>> {
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

    @SuppressWarnings("unchecked")
    public MyStack<O> clone() throws CloneNotSupportedException {
        return (MyStack<O>)super.clone();
    }

    public int compareTo(ArrayList<O> o) {
        if (list.size() > o.size()) { return 1; }
        else if (list.size() < o.size()) { return -1; }
        else { return 0; }
    }
}
