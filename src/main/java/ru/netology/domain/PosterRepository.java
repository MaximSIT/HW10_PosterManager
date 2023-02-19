package ru.netology.domain;

public class PosterRepository {
    private Poster[] listOfFilms = new Poster[0];

    public void save(Poster newFilm) {
        Poster[] tmp = new Poster[listOfFilms.length + 1];
        for (int i = 0; i < listOfFilms.length; i++) {
            tmp[i] = listOfFilms[i];
        }
        tmp[tmp.length - 1] = newFilm;
        listOfFilms = tmp;
    }

    public Poster[] findAll() {
        return listOfFilms;
    }

    public Poster findById(int id) {
        for (Poster film : listOfFilms) {
            if (film.getId() == id) {
                return film;
            }
        }
        return null;
    }

    public void removeById(int id) {
        int copyToIndex = 0;
        Poster[] tmp = new Poster[listOfFilms.length - 1];
        for (Poster film : listOfFilms) {
            if (film.getId() != id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        listOfFilms = tmp;
    }

    public void removeAll() {
        Poster[] tmp = new Poster[0];
        listOfFilms = tmp;
    }
}