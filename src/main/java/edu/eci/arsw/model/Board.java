package edu.eci.arsw.model;

import org.aspectj.weaver.Position;

import java.util.Random;

public class Board {

        private final int row;
        private final int col;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

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
    public Position locate_player(){
        Random random = new Random();
        int x = random.nextInt(col);
        int y = random.nextInt(row);
        if(!grid[x][y].isOwned()){
            Position pos = new Position(x,y);
            return pos;
        }else{
            locate_player();
        }
        return null;

    }

    }



