package banana;

import static org.junit.Assert.*;

import org.junit.Test;


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
}
