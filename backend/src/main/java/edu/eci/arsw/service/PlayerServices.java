package edu.eci.arsw.service;

import edu.eci.arsw.RedisConfig;
import edu.eci.arsw.model.Player;
import edu.eci.arsw.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class PlayerServices {
    @Autowired
    PlayerRepository playerRepository;

    @Cacheable(RedisConfig.cacheName)
    public void addPlayer(Player player) {
        playerRepository.save(player);
    }

    public Player updatePlayer(Player player) {
        playerRepository.findById(player.getId());
        return playerRepository.save(player);
    }

}
