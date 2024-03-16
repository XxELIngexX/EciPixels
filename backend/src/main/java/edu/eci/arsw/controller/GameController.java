package edu.eci.arsw.controller;

import edu.eci.arsw.model.*;
import edu.eci.arsw.service.BoardServices;
import edu.eci.arsw.service.PlayerServices;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
public class GameController {
    private PlayerServices playerServices;
    private BoardServices boardServices;
    @Getter @Setter private Board board;


    @GetMapping("/status")
    public String getStatus() {
        return "game";
    }
    @PostMapping("/api/players")
    public ResponseEntity<String> addPlayer(@RequestBody Player player, Integer id) {
        playerServices.addPlayer(player);
        boardServices.getBoardById(id).get().locatePlayer(player);
        // usar el metodo board.locate_player para ubicar al jugador en alguna casilla del juego
        return null;
    }
}
