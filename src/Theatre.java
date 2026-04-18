public class Theatre {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в театр!\n");

        Actor actor1 = new Actor("Александр", "Петров", "мужчина", 185);
        Actor actor2 = new Actor("Юлия", "Пересильд", "женщина", 170);
        Actor actor3 = new Actor("Иван", "Янковский", "мужчина", 178);

        Director director1 = new Director("Константин", "Хабенский", "мужчина", 45);
        Director director2 = new Director("Владимир", "Машков", "мужчина", 38);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Ольга Пикало";

        Show regularShow = new Show("Вишнёвый сад", 180, director1);
        Opera opera = new Opera("Евгений Онегин", 210, director2, musicAuthor,
                "Трагическая история о неразделённой любви Татьяны к Онегину", 30);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director1, musicAuthor, choreographer,
                "История принцессы Одетты, превращённой в белого лебедя");

        System.out.println("Обычный спектакль \"Вишнёвый сад\"");
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);
        regularShow.addActor(actor3);

        System.out.println("\nОперный спектакль \"Евгений Онегин\"");
        opera.addActor(actor2);
        opera.addActor(actor1);
        opera.addActor(actor3);

        System.out.println("\nБалетный спектакль \"Лебединое озеро\"");
        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println("\nВишнёвый сад");
        regularShow.printListOfActors();

        System.out.println("\nЕвгений Онегин");
        opera.printListOfActors();

        System.out.println("\nЛебединое озеро");
        ballet.printListOfActors();

        System.out.println("\nЗамена актёра в спектакле \"Евгений Онегин\"");
        opera.replaceActorBySurname(actor1, "Пересильд");

        System.out.println("\nОбновлённый список:");
        opera.printListOfActors();

        System.out.println("\nПопытка заменить несуществующего актёра");
        ballet.replaceActorBySurname(actor1, "Тарасова");

        System.out.println("\nЛибретто оперы \"Евгений Онегин\"");
        opera.printLibrettoText();

        System.out.println("\nЛибретто балета \"Лебединое озеро\"");
        ballet.printLibrettoText();

        System.out.println("\nСпектакли готовы! Зрители могут занимать свои места.");
    }
}