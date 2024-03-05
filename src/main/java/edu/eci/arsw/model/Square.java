package edu.eci.arsw.model;

import org.aspectj.weaver.Position;
import java.awt.Color;

public class Square {
    private final Position position;
    private boolean isOwned = false;
    private boolean isPowerUp = false;
    private Player owner;
    private Color color = Color.gray;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Square(int row, int col){
        this.position = new Position(row,col);
        this.aux = '+';



    }


}
