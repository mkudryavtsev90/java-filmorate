package ru.yandex.practicum.filmorate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.filmorate.model.Genre;
import ru.yandex.practicum.filmorate.service.GenreService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/genres")
public class GenreController {

    private final GenreService service;

    @GetMapping
    public ResponseEntity<List<Genre>> findAll() {
        List<Genre> genres = service.findAll();
        return ResponseEntity.ok().body(genres);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genre> findById(@PathVariable Long id) {
        Genre genre = service.findById(id);
        return ResponseEntity.ok().body(genre);
    }
}
