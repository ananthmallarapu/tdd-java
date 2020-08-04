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
}
