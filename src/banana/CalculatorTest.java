package banana;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class CalculatorTest {

	@Test
	public void add_EmptyString_ReturnZero() {
		Calculator calculator = new Calculator() ; 
		int expected = calculator.add("") ; 
		assertEquals (0 ,expected) ; 
	}
	
	@Test
	public void add_SingleNumber_ReturnSameNumber() {
		Calculator calculator = new Calculator() ; 
		int expected = calculator.add("1") ; 
		assertEquals (1 ,expected) ; 
	}

	@Test
	public void add_TwoNumberCommaSeperated_ReturnSum() {
		Calculator calculator = new Calculator() ; 
		int expected = calculator.add("1,2") ; 
		assertEquals (3 ,expected) ; 
	}
	@Test
	public void add_ThreeNumberCommaSeperated_ReturnSum() {
		Calculator calculator = new Calculator() ; 
		int expected = calculator.add("1,2,3") ; 
		assertEquals (6 ,expected) ; 
	}
	@Test
	public void add_FourNumberCommaSeperated_ReturnSum() {
		Calculator calculator = new Calculator() ; 
		int expected = calculator.add("1,2,3,4") ; 
		assertEquals (10 ,expected) ; 
	}
	@Test
	public void add_NumbersSeperatedByNewLine_ReturnSum() {
		Calculator calculator = new Calculator() ; 
		int expected = calculator.add("1\n2,3\n4") ; 
		assertEquals (10 ,expected) ; 
	}
	@Test
	public void add_NumbersSeperatedByDifferentDelimiters_ReturnSum() {
		Calculator calculator = new Calculator() ; 
		int expected = calculator.add("//;\n1;2;3;4") ; 
		assertEquals (10 ,expected) ; 
	}
	@Test
	public void add_NumbersSeperatedByColon_ReturnSum() {
		Calculator calculator = new Calculator() ; 
		int expected = calculator.add("//:\n1:2:3:4") ; 
		assertEquals (10 ,expected) ; 
	}
	
	@Rule 
	public ExpectedException calculatorExceptionRule = ExpectedException.none() ; 
	
	@Test
	public void add_OneNegativeNumber_ThrowsError() {
		Calculator calculator = new Calculator() ; 
		calculatorExceptionRule.expect(IllegalArgumentException.class) ;
		calculatorExceptionRule.expectMessage("negatives not allowed .negative numbers are -1");
		int expected = calculator.add("//;\n-1") ; 
		
	}
	@Test
	public void add_TwoNegativeNumbers_ThrowsError() {
		Calculator calculator = new Calculator() ;
		calculatorExceptionRule.expect(IllegalArgumentException.class) ;
		calculatorExceptionRule.expectMessage("negatives not allowed .negative numbers are -1,-2");
		int expected = calculator.add("//:\n-1:-2") ; 
		
	}
	@Test
	public void add_OneVeryLargeNumber_ReturnSum() {
		Calculator calculator = new Calculator() ; 
		int expected = calculator.add("//:\n1001") ; 
		assertEquals (0 ,expected) ; 
	}
	@Test
	public void add_OneVeryLargeNumberAndOneSmallNumber_ReturnSum() {
		Calculator calculator = new Calculator() ; 
		int expected = calculator.add("//:\n1001:2") ; 
		assertEquals (2 ,expected) ; 
	}
	@Test
	public void add_DelimiterOfAnyLength_ReturnSum() {
		Calculator calculator = new Calculator() ; 
		int expected = calculator.add("//;;;\n1;;;2;;;3") ; 
		assertEquals (6 ,expected) ; 
	}
	@Test
	public void add_MultipleDelimiter_ReturnSum() {
		Calculator calculator = new Calculator() ; 
		int expected = calculator.add("//;,;\n1;,;2;,;3") ; 
		assertEquals (6 ,expected) ; 
	}
}
