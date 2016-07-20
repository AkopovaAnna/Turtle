package Game;

/**
 * Possible positio of pen, which is attached to turtle
 */
public enum Pen {
	   PENUP("UP"),
	   PENDOWN("DOWN");


	    private String name;

	    private Pen(String name){
	        this.name= name;
	    }

	    public String getName(){
	        return name;
	    }
	   
}
