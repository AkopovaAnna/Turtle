package Game.Exception;

/**
 * Created by akopova on 7/12/16.
 */
public class OutOfBoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4955175644953460153L;

	public OutOfBoundException(){

    }

    public OutOfBoundException(String message){
        super(message);
    }
}
