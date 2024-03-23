package edu.eci.arsw.model;

import org.aspectj.weaver.Position;
import org.springframework.data.redis.core.RedisHash;

import java.awt.Color;
@RedisHash
public class Square {
    private final Position position;
    private boolean isOwned = false;
    private boolean isPowerUp = false;
    private Player owner;
    private String color = Color.gray.toString();
    private byte aux;



    public boolean isOwned() {
        return isOwned;
    }

    public void setOwned(boolean owned) {
        isOwned = owned;
    }

    public boolean isPowerUp() {
        return isPowerUp;
    }

    public void setPowerUp(boolean powerUp) {
        isPowerUp = powerUp;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Square(int row, int col){
        this.position = new Position(row,col);
        this.aux = '+';

    }


}
