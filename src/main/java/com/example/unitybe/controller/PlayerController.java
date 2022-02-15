package com.example.unitybe.controller;

import com.example.unitybe.model.Player;
import com.example.unitybe.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class PlayerController {
    private final PlayerService playerService;

    // add player
    @PostMapping("api/v1/player")
    @ResponseBody
    public String addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }

    // get players
    @GetMapping("api/v1/players")
    @ResponseBody
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    //get player
    @GetMapping("api/v1/player")
    @ResponseBody
    public Player getPlayer(@RequestParam String ign){
        return  playerService.getPlayer(ign);
    }
}
