package edu.eci.arsw.controller;

import edu.eci.arsw.model.*;
import edu.eci.arsw.service.BoardServices;
import edu.eci.arsw.service.PlayerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private final PlayerServices playerServices = new PlayerServices();


    private  final BoardServices boardServices;

    public GameController(BoardServices boardServices){ 
        this.boardServices = boardServices;
    }



    @GetMapping("/status")
    public String getStatus() {
        return "game";
    }
    @PostMapping("/api/players")
    public ResponseEntity<String> addPlayer(@RequestBody Player player, Integer id) {
        playerServices.addPlayer(player);
        boardServices.getBoardById(id).get().locatePlayer(player);
        return null;
    }
}
