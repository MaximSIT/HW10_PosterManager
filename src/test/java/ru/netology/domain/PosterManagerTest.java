package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    Poster film1 = new Poster(1, "Bloodshot", "action");
    Poster film2 = new Poster(2, "Forward", "cartoon");
    Poster film3 = new Poster(3, "Hotel Belgrade", "comedy");
    Poster film4 = new Poster(4, "Gentlemen", "action");
    Poster film5 = new Poster(5, "Invisible man", "horror");
    Poster film6 = new Poster(6, "Trolls", "cartoon");
    Poster film7 = new Poster(7, "Number one", "comedy");
    Poster film8 = new Poster(8, "Harry Potter", "family");
    Poster film9 = new Poster(9, "Fast", "action");
    Poster film10 = new Poster(10, "1+1", "drama");
    Poster film11 = new Poster(11, "Holiday", "comedy");

    @Test
    public void shouldAddOneFilm() {
        PosterManager manager = new PosterManager();
        manager.addFilm(film1);

        Poster[] excepted = {film1};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(excepted, actual);
    }

    @Test
    public void shouldAddSeveralFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        Poster[] excepted = {film1, film2, film3};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(excepted, actual);
    }

    @Test
    public void shouldShowLastTenFilms() {
        PosterManager manager = new PosterManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        manager.findLast();

        Poster[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastTwoFilms() {
        PosterManager manager = new PosterManager(2);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        manager.findLast();

        Poster[] expected = {film3, film2};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastThreeFilmsWhenLimitThree() {
        PosterManager manager = new PosterManager(3);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        manager.findLast();

        Poster[] expected = {film3, film2, film1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastThreeFilmsWhenLimitFour() {
        PosterManager manager = new PosterManager(4);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        manager.findLast();

        Poster[] expected = {film3, film2, film1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}