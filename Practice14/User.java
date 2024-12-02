public class User implements Observer {
    private String username;
    public User(String name) { username = name; }
    public String getName() { return username; }

    public void setName(String name) {
        update("Your name was changed to: " + name);
        username = name;
    }
    public void update(String msg) {
        System.out.println(username + " has received a message: " + msg);
    }
}
