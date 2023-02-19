package ru.netology.domain;

public class PosterManager {
    private PosterRepository repo;

    public PosterManager(PosterRepository repo) {
        this.repo = repo;
    }

    public void save(Poster film) {
        repo.save(film);
    }

    public Poster[] findAll() {
        return repo.findAll();
    }

    public Poster findById(int id) {
        return repo.findById(id);
    }

    public void removeById(int id) {
        repo.removeById(id);
    }

    public void removeAll() {
        repo.removeAll();
    }
}