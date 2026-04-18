public class Director {
    private String name;
    private String surname;
    private String gender;
    private int numberOfShows;

    public Director(String name, String surname, String gender, int numberOfShows) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.numberOfShows = numberOfShows;
    }

    public String toString() {
        return name + " " + surname;
    }
}