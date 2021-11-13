package ru.netology.manager;

public class Manager {

    // номинальный лимит выдачи
    static int resultLimit = 10;

    // argsConstructor
    public Manager(int resultLimit) {
        this.resultLimit = resultLimit;
    }

    // noArgsAonstructor
    public Manager() {
    }

    static class Movie {

        private String id;
        private String imageUrl;
        private String name;
        private String genre;

        public Movie(String id, String imageUrl, String name, String genre) {
            this.id = id;
            this.imageUrl = imageUrl;
            this.name = name;
            this.genre = genre;
        }

        // подготавливаем тестовые данные
        static Movie film1 = new Movie("quarantine2008", "ref", "Quarantine", "Action");
        static Movie film2 = new Movie("taken2008", "ref", "Taken", "Action");
        static Movie film3 = new Movie("hulk2008", "ref", "Hulk", "Action");
        static Movie film4 = new Movie("rambo2008", "ref", "Rambo", "Action");
        static Movie film5 = new Movie("race2008", "ref", "Race", "Action");
        static Movie film6 = new Movie("sunday2008", "ref", "Sunday", "Action");
        static Movie film7 = new Movie("hancock2008", "ref", "Hancock", "Action");
        static Movie film8 = new Movie("wanted2008", "ref", "Wanted", "Action");
        static Movie film9 = new Movie("jumper2008", "ref", "Jamper", "Action");
        static Movie film10 = new Movie("mummy2008", "ref", "Mummy", "Action");
        // сохраняем в массив
        static Movie[] movies = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
    }

    static Movie[] posterLot = new Movie[0];

    // этот метод добавляет объекты из массива movies в новый массив. Кол-во добавляемых объектов
    // указывается в параметре
    public static void addLot(int much) {
        int length = posterLot.length + much;
        Movie[] tmp = new Movie[length];
        System.arraycopy(Movie.movies, 0, tmp, 0, much);
        posterLot = tmp;
    }

    static Movie[] posterResult = new Movie[0];

    static int tmpArrLength = 0;

    // этот метод выводит содержимое массива posterLot в обратном порядке. Кол-во выводимых объектов
    // указано в поле resultLimit
    public static void exePosterResult() {
        if (resultLimit == 0) {
            tmpArrLength = 0;
        } else if (resultLimit > posterLot.length) {
            tmpArrLength = posterLot.length;
        } else {
            tmpArrLength = resultLimit;
        }
        Movie[] result = new Movie[tmpArrLength];
        for (int i = 0; i < result.length; i++) {
            int index = posterLot.length - i - 1;
            result[i] = posterLot[index];
        }
        posterResult = result;
    }

}




