package MusicLibrary;

    import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    private ArrayList<Song> songs;
    private Random random;

    public MusicLibrary() {
        songs = new ArrayList<>();
        random = new Random();
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println(song + " added to the library.");
    }

    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println(song + " removed from the library.");
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
        } else {
            int index = random.nextInt(songs.size());
            System.out.println("Now playing: " + songs.get(index));
        }
    }

    public void displaySongs() {
        System.out.println("\nAll Songs:");
        for (Song song : songs) {
            System.out.println("- " + song);
        }
    }
}
