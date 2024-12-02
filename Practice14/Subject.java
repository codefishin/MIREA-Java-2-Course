import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String data;
    public String getData() { return data; }
    public void AddObs(Observer observer) {
        observers.add(observer);
        // System.out.println("\nAdded new observer: " + observer);
    }
    public void RemoveObs(Observer observer) {
        observers.remove(observer);
        // System.out.println("\nRemoved observer: " + observer);
    }

    public void Notify() {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }
    public void SendMessage(String newData) {
        data = newData;
        Notify();
    }
}
