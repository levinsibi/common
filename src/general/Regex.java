package general;

import java.util.regex.Pattern;

public class Regex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(Pattern.matches("[a-zA-Z]*+[0-9]*+@[a-zA-Z0-9]*+\\.[a-zA-Z]{2,6}", "levin123@gmail.com"));
	}

}
