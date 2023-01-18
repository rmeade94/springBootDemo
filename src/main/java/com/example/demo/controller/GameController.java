package com.example.demo.controller;

import com.example.demo.entity.Game;
import com.example.demo.repository.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
@AllArgsConstructor
public class GameController {

    private GameRepository gameRepository;

    @GetMapping("/game/{id}")
    public ResponseEntity<Game> getGame(@PathVariable("id") Integer id) {
        Game game = gameRepository.findById(id).get();
        return ResponseEntity.ok(game);
    }

    @PostMapping("/game")
    public ResponseEntity<Game> createGame(@RequestBody Game game) {
        Game newGame = gameRepository.save(game);
        return ResponseEntity.ok(newGame);
    }
}
