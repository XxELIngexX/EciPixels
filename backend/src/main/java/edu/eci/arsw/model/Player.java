package edu.eci.arsw.model;

import edu.eci.arsw.RedisConfig;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import javax.swing.text.Position;
import java.awt.*;
import java.util.List;
//@Cacheable(value = RedisConfig.cacheName)
@RedisHash
public class Player {
    @Id

    private String id;

    private String name;

    private int score;

    private Position position;

    private List<Square> tilesOwned;
   private boolean isAlive = true;
    private String color = Color.gray.toString();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Square> getTilesOwned() {
        return tilesOwned;
    }

    public void setTilesOwned(List<Square> tilesOwned) {
        this.tilesOwned = tilesOwned;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Player(String name) {
        this.name = name;
    }
}
