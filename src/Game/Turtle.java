package Game;

public class Turtle {
	
    private int xPosition; //turtle x coordinate in board
    private int yPosition; // turtle y coordinate in board
    private Direction direction;
    private Pen penStatus;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Pen getPenStatus() {
        return penStatus;
    }

    public void setPenStatus(Pen penStatus) {
        this.penStatus = penStatus;
    }

    public Turtle() {
        xPosition = 0;
        yPosition = 0;
        direction = Direction.DOWN;
        penStatus = Pen.PENUP;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

}
