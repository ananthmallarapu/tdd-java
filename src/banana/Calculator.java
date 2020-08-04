package banana;

import java.util.Arrays;
import java.util.List;

public class Calculator {


		
		public int add (String numbers ) {
			int result = 0 ;
			if (numbers == "") {
				return result ; 
			}
			
			List<String> numberArrays = Arrays.asList(numbers.split("\\s*,\\s*"));
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
