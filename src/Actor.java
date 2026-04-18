import java.util.Objects;

public class Actor {
    private String name;
    private String surname;
    private String gender;
    private int height;

    public Actor(String name, String surname, String gender, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return name + " " + surname + " (" + height + " см)";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Actor actor = (Actor) obj;
        return Double.compare(actor.height, height) == 0 &&
                Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname);
    }

    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}