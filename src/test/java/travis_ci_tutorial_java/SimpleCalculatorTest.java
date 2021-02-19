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
		assertEquals(calc.minus(5, 3), 2);
	}

	@Test
	public void testMultiply(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(2, 2), 4);

	}

	@Test
	public void testDivide(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(1.0, calc.divide(4, 4), 0.0);
	}

	@Test
	public void testDivideByZero(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(1, calc.divide(4, 0),0.0);
	}

	@Test
	public void testDivideByNonInteger(){
		SimpleCalculator calc = new SimpleCalculator();
		double value = calc.divide(9, 2);
		assertEquals(4.5, value, 0.0);
	}
}