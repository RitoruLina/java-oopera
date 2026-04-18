public class Ballet extends MusicShow {
    String choreographer;

    public Ballet(String title, int duration, Director director, String musicAuthor, String choreographer, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
