package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class PosterManagerTest {
    //PosterRepository repo = new PosterRepository();
    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(repo);

    Poster film1 = new Poster(1, "Fast", "action");
    Poster film2 = new Poster(2, "ForestGump", "drama");
    Poster film3 = new Poster(3, "NationalSecurity", "comedy");

//    @BeforeEach
//    public void setup() {
//        manager.save(film1);
//        manager.save(film2);
//        manager.save(film3);
//    }

    @Test
    public void shouldAddFilms() {
        Poster[] films = {film1, film2, film3};
        doReturn(films).when(repo).findAll();

        Poster[] expected = {film1, film2, film3};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

//    @Test
//    public void shouldFindById() {
//        Poster movie = manager.findById(2);
//
//        Poster[] expected = {film2};
//        Poster[] actual = {movie};
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldRemoveById() {
//        manager.removeById(2);
//
//        Poster[] expected = {film1, film3};
//        Poster[] actual = manager.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldRemoveAll() {
//        manager.removeAll();
//
//        Poster[] expected = new Poster[0];
//        Poster[] actual = manager.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
}