package exception;

public class InvalidAgeException extends Exception{

	/**
	 * @param args
	 */
	InvalidAgeException(String s)
	{
		//super(s);
		
		System.err.println(s);
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		int age=12;
		
		if(age<18)
		{
			try{
				throw new InvalidAgeException("You are not mature enough");
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("still i have executed");
	}

}
