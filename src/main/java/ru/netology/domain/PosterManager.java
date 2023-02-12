package ru.netology.domain;

public class PosterManager {
    private int maxLimit;

    public PosterManager() {
        maxLimit = 10;
    }

    public PosterManager(int newMaxLimit) {
        maxLimit = newMaxLimit;
    }

    private Poster[] listOfFilms = new Poster[0];

    public void addFilm(Poster film) {
        Poster[] tmp = new Poster[listOfFilms.length + 1];
        for (int i = 0; i < listOfFilms.length; i++) {
            tmp[i] = listOfFilms[i];
        }
        tmp[tmp.length - 1] = film;
        listOfFilms = tmp;
    }

    public Poster[] findAll() {
        return listOfFilms;
    }

    public Poster[] findLast() {
        int resultLength;
        if (listOfFilms.length <= maxLimit) {
            resultLength = listOfFilms.length;
        } else {
            resultLength = maxLimit;
        }
        Poster[] lastReversed = new Poster[resultLength];
        for (int i = 0; i < lastReversed.length; i++) {
            lastReversed[i] = listOfFilms[listOfFilms.length - 1 - i];
        }
        return lastReversed;
    }
}