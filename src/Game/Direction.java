package Game;

/**
 * Direction enum class gives info about possible movement directions of turtle
 */

public enum Direction {
	    UP(1),
	    RIGHT(2),
	    DOWN(3),
	    LEFT(4);

	    private int name;

	    private Direction(int name) {
	        this.name = name;
	    }

	    public int getName(){
	        return name;
	    }

    /**
     * Depending on magnitude of turn, by this mehod will be managed
     * in which direction will turn turtle, depending on head position
     * @param magnitude : the value of turn direction
     * @return direction value
     */

    public Direction turn(int magnitude) {
	        return  values()[(ordinal() + magnitude) % 4];
	    }

	    public Direction turnLeft() {
	        return turn(3);
	    }

	    public Direction turnRight() {
	        return turn(1);
	    }
	    
	    public Direction turnUp() {
	        return turn(2);
	    }
	    
	    public Direction turnDown() {
	        return turn(0);
	    }

	public static void main(String[] args) {
		Direction dir = Direction.DOWN;
		System.out.println(dir.turnLeft());
		System.out.println(dir.getName());
	}
}
