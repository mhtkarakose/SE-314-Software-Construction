
public class ChechStringException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public ChechStringException(){
        super();
    }

    public ChechStringException(String message){
        super(message);
        System.out.println(message);
		System.exit(0);
    }
}
