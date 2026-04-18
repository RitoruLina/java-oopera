public class Ballet extends MusicShow {
    private String choreographer;

    public Ballet(String title, int duration, Director director, String musicAuthor, String choreographer, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }
}
