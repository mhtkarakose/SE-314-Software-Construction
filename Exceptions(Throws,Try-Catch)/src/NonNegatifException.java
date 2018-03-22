
public class NonNegatifException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NonNegatifException(){
        super();
    }

    public NonNegatifException(String message){
        super(message);
        System.out.println(message);
		System.exit(0);
    }

}
