package edu.eci.arsw.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import javax.swing.text.Position;
import java.awt.*;
import java.util.List;
@Entity
@Table (name = "PLAYERS")
public class Player {
    @Id
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private int score;
    @Column
    private Position position;
    @Column
    private List<Square> tilesOwned;
    @Column
    private boolean isAlive = true;
    @Column
    private Color color = Color.gray;

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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Player(String name) {
        this.name = name;
    }
}
