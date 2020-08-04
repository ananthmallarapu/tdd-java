package banana;

import java.util.Arrays;
import java.util.List;

public class Calculator {

        public List <String> stringParser (String numbers ) {
        	
        	String delimiterValue = "," ; 
        	if (numbers.startsWith("//")) {
        		
        		int delimiterIndex = numbers.indexOf("\n") ; 
        		delimiterValue = numbers.substring(0,delimiterIndex).replace("//","") ;
        		numbers = numbers.substring(delimiterIndex+1) ; 
        	}
        	
        	
			String delimiterRegex  = "\\s*"+ delimiterValue + "|\n" +"\\s*"; 
        	
        	List<String> numberArrays = Arrays.asList(numbers.split(delimiterRegex));
        	
        	return numberArrays ;
        }
		
		public int add (String numbers ) {
			int result = 0 ;
			if (numbers == "") {
				return result ; 
			}
			
			List<String> numberArrays = stringParser (numbers) ;
			if (numberArrays.size() == 1)
			{
				return Integer.parseInt(numberArrays.get(0));
			}
			else {
				for (String number : numberArrays) {
					result =  result +  Integer.parseInt(number) ;
				}
			}
			
			return result ;
		}
	
}
