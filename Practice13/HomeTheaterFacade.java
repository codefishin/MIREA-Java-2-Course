class DVDPlayer {
    public void on() { System.out.println("DVD Player is ON"); }
    public void play(String movie) { System.out.println("Playing movie: " + movie); }
    public void off() { System.out.println("DVD Player is OFF"); }
}
class Projector {
    public void on() { System.out.println("Projector is ON"); }
    public void setInput(String input) { System.out.println("Projector input set to: " + input); }
    public void off() { System.out.println("Projector is OFF"); }
}
class SoundSystem {
    public void on() { System.out.println("Sound System is ON"); }
    public void setVolume(int level) { System.out.println("Volume set to: " + level); }
    public void off() { System.out.println("Sound System is OFF"); }
}

public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem soundSystem;
    public HomeTheaterFacade(DVDPlayer setDVD,
                  Projector setProjector,
                  SoundSystem setSoundSystem) {
    dvd = setDVD;
    projector = setProjector;
    soundSystem = setSoundSystem;
    }
    public void watchMovie(String movie) {
        dvd.on();
        projector.on();
        soundSystem.on();
        projector.setInput("DVD");
        soundSystem.setVolume(10);
        dvd.play(movie);
    }
    public void endMovie() {
        dvd.off();
        projector.off();
        soundSystem.off();
    }
}
