// VARIANT 5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade HTF = new HomeTheaterFacade(new DVDPlayer(),
                new Projector(), new SoundSystem());
        Scanner input = new Scanner(System.in);
        String data = "";

        System.out.println("Please enter the movie you want to watch.\n");
        data = input.nextLine();
        HTF.watchMovie(data);
        System.out.println("\nMovie is currently playing. Do you wish to terminate your DVD player?\nEnter any letter to stop viewing.");
        data = input.nextLine();
        HTF.endMovie();
    }
}
