package Game;

import Game.Exception.OutOfBoundException;

/**
 * Created by akopova on 7/12/16.
 */
public class Handler {

    private Board board;
    private Turtle turtle;

    public Handler() {
        board = new Board(8);
        turtle = new Turtle();
    }

    public void turn(int direction){
        if (direction == Commands.TURN_RIGHT) {
            turtle.setDirection(turtle.getDirection().turnRight()); //yet have enum Direction class :D

        } else if (direction == Commands.TURN_LEFT) {
            turtle.setDirection(turtle.getDirection().turnLeft());

        }  else if (direction == Commands.TURN_UP) {

            if (turtle.getDirection() == Direction.RIGHT){
                turtle.setDirection(turtle.getDirection().turnLeft());
            } else if(turtle.getDirection() == Direction.LEFT){
                turtle.setDirection(turtle.getDirection().turnRight());
            } else{
                turtle.setDirection(turtle.getDirection().turnUp());
            }

        } else if (direction == Commands.TURN_DOWN) {

            if (turtle.getDirection() == Direction.RIGHT){
                turtle.setDirection(turtle.getDirection().turnRight());
            } else if(turtle.getDirection() == Direction.LEFT){
                turtle.setDirection(turtle.getDirection().turnLeft());
            } else{
                turtle.setDirection(turtle.getDirection().turnDown());
            }
        }
    }

    public void move(int space) throws OutOfBoundException  {
        int currentX = turtle.getxPosition();
        int currentY = turtle.getyPosition();
        Direction turnDirection = turtle.getDirection();
        if (Validator.legal(currentX + (space-1), currentY +(space-1), board.getBoardSize())) {
            if (turtle.getPenStatus() == Pen.PENDOWN) {
                board.changePosition(turtle.getxPosition(), turtle.getyPosition(), turnDirection, space);
            }
            if (turnDirection == Direction.DOWN) {
                currentX += space;
                turtle.setxPosition(currentX);
            } else if (turnDirection == Direction.RIGHT) {
                currentY += space;
                turtle.setyPosition(currentY);
            } else if (turnDirection == Direction.LEFT) {
                currentY -= space;
                turtle.setyPosition(currentY);
            } else if (turnDirection == Direction.UP) {
                currentX -= space;
                turtle.setxPosition(currentX);
            }
        } else {
            throw new OutOfBoundException("Out of board bounds. "); //Sorry enter right amount of steps to move
        }
    }

    public void enterCommands(int command, int input) throws OutOfBoundException{
        switch(command) {

            case Commands.PEN_UP:
                System.out.println("Pen Has Been Set To 'Up' Position\n");
                turtle.setPenStatus(Pen.PENUP);
                break;
            case Commands.PEN_DOWN:
                System.out.println("Pen Has Been Set To 'Down' Position\n");
                turtle.setPenStatus(Pen.PENDOWN);
                break;
            case Commands.TURN_DIRECTION:
                turn(input);
                break;
            case Commands.MOVE_FORWARD:
                move(input);
                break;
            case Commands.DISPLAY:
                System.out.println("The trajectory of turtle...\n");
                board.display();
                break;
            case Commands.CLEAR_BOARD:
                turtle = new Turtle();
                board = new Board(board.getBoardSize()); //the * will be erased when returning to start
                break;
            case Commands.END:
                System.out.println("Ending Program, Goodbye\n");
                break;
            default:
                break;
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }
}
