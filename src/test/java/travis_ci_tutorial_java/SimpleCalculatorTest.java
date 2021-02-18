package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

		@Test
	public void testSubtract(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 1);
	}

	@Test
	public void testMultiply(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(2, 2), 4);

	}

	@Test
	public void testDivide(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(4, 4), 1);

	}

	@Test
	public void testDivideByZero(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(4, 0), 1);
	}

	@Test
	public void testDivideByNonInteger(){
		SimpleCalculator calc = new SimpleCalculator();
		int value = calc.divide(9, 2);
		double doubleValue;
		doubleValue = value;
		assertEquals(4.5, doubleValue, 0.0);
	}
}