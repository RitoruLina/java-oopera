import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration; //длительность в минутах
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printListOfActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст");
            return;
        }

        System.out.println("Актёры спектакля \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println("\t" + actor.toString());
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor.toString() + " уже есть в спектакле \"" + title + "\"");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor.toString() + " добавлен в спектакль \"" + title + "\"");
        }
    }

    public void replaceActorBySurname(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр с фамилией " + surname + " заменён на " + newActor.toString() + " в спектакле \"" + title + "\"");
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " не найден в спектакле \"" + title + "\"");
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director.toString());
    }
}
