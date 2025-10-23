package MusicLibrary;

public class MusicLibraryMain {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        Song s1 = new Song("Basta wala ka", "No pet allowed");
        Song s2 = new Song("Blinding Lights", "The Weeknd");
        Song s3 = new Song("Believer", "Imagine Dragons");

        library.addSong(s1);
        library.addSong(s2);
        library.addSong(s3);

        library.displaySongs();

        System.out.println("\nPlaying a random song:");
        library.playRandomSong();

        System.out.println("\nRemoving a song...");
        library.removeSong(s2);
        library.displaySongs();
    }
}

