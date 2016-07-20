package Game;


import Game.Exception.OutOfBoundException;

/**
 * Created by akopova on 7/12/16.
 */
public class Validator {

    /**
     * Check the borders of board
     * @param row the row of the board
     * @param col the column of the board
     * @param boardSize the size of the board
     * @return boolean; true if turtle inside of of board bound, false otherwise
     */
    public static boolean legal(int row, int col, int boardSize) {
        return row >= 0 && row < boardSize &&
                col >= 0 && col < boardSize;
    }
}
