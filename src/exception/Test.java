package exception;

public class Test {

	/**
	 * @param args
	 */
	static void check()  throws ArithmeticException
	{
		System.out.println("throws wil give a prior knowledge to the caller about which exception to handle");
		throw new ArithmeticException("Arithmetic");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			check();
		}
		catch(ArithmeticException e)
		{
			System.out.println("execption is--->"+e);
		}
		System.out.println("my program hasent stopped yet");

	}

}
