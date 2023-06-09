package ru.yandex.practicum.filmorate.service;

import ru.yandex.practicum.filmorate.model.Film;

import java.util.List;

public interface FilmService {

    List<Film> getAllFilms();

    Film addFilm(Film film);

    Film updateFilm(Film film);

    Film getFilmByID(Long id);

    void addLike(Long filmID, Long userID);

    void removeLike(Long filmID, Long userID);

    List<Film> getPopular(Long count);

}