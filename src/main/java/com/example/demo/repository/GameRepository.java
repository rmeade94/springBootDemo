package com.example.demo.repository;

import com.example.demo.entity.Game;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends CrudRepository<Game, Integer> {
    @Query("SELECT Game where Game.name like name")
    List<Game> findGamesByName(String name);
}
