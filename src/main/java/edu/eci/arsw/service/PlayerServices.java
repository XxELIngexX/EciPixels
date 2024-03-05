package edu.eci.arsw.service;

import edu.eci.arsw.model.Player;
import edu.eci.arsw.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServices {
    @Autowired
    PlayerRepository playerRepository;


    public void addPlayer(Player player) {
        // Aquí puedes agregar lógica adicional antes de guardar el jugador, si es necesario
        playerRepository.save(player);
    }

    public Player updatePlayer(Player player) {
        playerRepository.findById(player.getId());
        return playerRepository.save(player);
    }

}
