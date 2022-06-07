package module.rh;

import java.util.regex.Pattern;

public class Regex {
	
	
	
	
	
	public static boolean regexSalaire(String s) {
		
//		System.out.println("'Salaire bien pris en compte.'");
		
		String regExPattern = "\\b\\d{1,4}\\b";
		
		boolean matches = false;
		
		matches = Pattern.matches(regExPattern, s);

	return matches; 
	}
	
	

}
