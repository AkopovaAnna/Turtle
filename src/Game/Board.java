package Game;

public class Board {
    private boolean[][] board; //stores board info
    private int boardSize; //the number of cells in board


    /**
     * Creates an object with specified size for boolean board array
     *
     * @param size the size of the board
     */
    public Board(int size) {
        this.boardSize = size;
        this.board = new boolean[boardSize][boardSize];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                board[i][j] = false;
        }
    }

    public boolean[][] getBoard() {
        return board;
    }

    public void setBoard(boolean[][] board) {
        this.board = board;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    /**
     * Draw the game board
     * depending on turtle moves and pen position,attached to it
     * when pen is down the board value in particular position is set to true and print '*'
     * otherwise '-'
     */

    public void display() {
        for (int x = 0; x < boardSize; x++) {
            for (int y = 0; y < boardSize; y++) {
                if (board[x][y]) {
                    System.out.printf("*");
                } else if (!board[x][y]) {
                    System.out.printf("-");
                } else {
                    System.out.printf("0"); //need?
                }
            }
            System.out.println();
        }
    }

    /**
     * This method change the trajectory of turtle in board, based on this parameteers
     * @param xPos : x coordinate of turtle in 2D board
     * @param yPos : y position
     * @param dir : direction of turtle head
     * @param countSpace : the numer of steps,that turtle will go through the board cells
     */

    public void changePosition(int xPos, int yPos, Direction dir, int countSpace) {
        for (int i = 0; i <= countSpace; i++) {
            if (dir == Direction.DOWN) {  
            	board[xPos][yPos] = true;      	
                xPos++;
            } else if (dir == Direction.UP) {
                board[xPos][yPos] = true;
                xPos--;
            } else if (dir == Direction.LEFT) {
                board[xPos][yPos] = true;
                yPos--;
            } else if (dir == Direction.RIGHT) {
                board[xPos][yPos] = true;
                yPos++;
            }
            
        }
    }
}

