package com.example.unitybe.service;

import com.example.unitybe.model.Player;
import com.example.unitybe.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public String addPlayer(Player player) {
        List<Player> players = playerRepository.findAll();
        for (Player p : players) {
            if(p.getIgn().equals(player.getIgn())){
                System.out.println("addPlayer-> " + player.getIgn() + " ERROR");
                return "ERROR";
            }
        }
        playerRepository.insert(player);
        System.out.println("addPlayer-> " + player.getIgn() + " OK");
        return "OK";
    }

    public List<Player> getAllPlayers() {
        System.out.println("getAllPlayers");
        return playerRepository.findAll();
    }

    public Player getPlayer(String ign) {
        System.out.println("getPlayer-> " + ign);
        return playerRepository.findPlayerByIgn(ign);
    }
}
