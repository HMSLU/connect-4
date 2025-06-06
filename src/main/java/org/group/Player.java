package org.group;

import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private String token;

    public Player(String name, String token){
        this.name = name;
        this.token = token;
    }

    public String getName(){
        return name;
    }

    public String getToken(){
        return token;
    }

    public int makeMove(int column, String[][] board){
        for (int row = board.length - 1; row >= 0; row--){
            if (board[row][column] == null){ // to see if it has empty space
                board[row][column] = token;
                return row; // should return the row where it was placed
            }
        }
        return -1; 
    }
}
