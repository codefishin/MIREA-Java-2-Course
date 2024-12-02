public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        User user1 = new User("stomp");
        User user2 = new User("stompbox");
        subject.AddObs(user1);
        subject.AddObs(user2);

        subject.SendMessage("Hello, this is a test notification");
        user1.setName("stompierre");
        subject.RemoveObs(user2);
        subject.SendMessage("New message");
    }
}
