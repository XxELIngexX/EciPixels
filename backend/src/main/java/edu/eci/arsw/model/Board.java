package edu.eci.arsw.model;


import net.bytebuddy.asm.Advice;
import org.aspectj.weaver.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.Random;

import javax.persistence.Entity;

@RedisHash
public class Board {
    @Id
    private Integer id;
     private final int row;
     private final int col;
     private final Square[][] grid;



        public Board(int row,int col){
            this.row=row;
            this.col=col;
            grid = new Square[row][col];
            for (int r = 0; r < row; r++){
                for (int c = 0; c < col;c++){
                    grid[r][c]= new Square(r,c);
                }
            }

        }

        // este metodo ya hace la validacion si la casilla esta o no esta ocupada, faltaria colorear del mismo color que el jugador el cuadro de 3x3
    public Position locatePlayer(Player player){
        Random random = new Random();
        int x = random.nextInt(col);
        int y = random.nextInt(row);
        if(!grid[x][y].isOwned()){
            Position pos = new Position(x,y);
            return pos;
        }else{
            locatePlayer(player);
        }
        return null;

    }

    }



