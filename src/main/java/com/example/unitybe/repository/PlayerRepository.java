package com.example.unitybe.repository;

import com.example.unitybe.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {
    public Player findPlayerByIgn(String ign);
}
