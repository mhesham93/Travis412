package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int minus(int a,int b) {return a-b;}

	public int multiply(int a,int b) {return a*b;}

	public double divide (int a,int b) {
		if(b == 0) return 1;
		return (double) a / (double) b;
	}
}
