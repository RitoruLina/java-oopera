public class MusicShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public MusicShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println("Либретто спектакля \"" + title + "\":");
        System.out.println("\t" + librettoText);
    }
}
