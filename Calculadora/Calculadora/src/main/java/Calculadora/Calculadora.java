package Calculadora;

public class Calculadora {
	
	/**Attributes*/
	private double num1;
	
	private double num2;
	
	private String op;
	
	private double r;

	/** Constructors */
	
	public void Calculadora() {		
	}
	
	/**Getters & Setters */
	
	/**
	 * @return the num1
	 */
	public double getNum1() {
		return num1;
	}

	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	/**
	 * @return the num2
	 */
	public double getNum2() {
		return num2;
	}

	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(double num2) {
		this.num2 = num2;
	}

	/**
	 * @return the op
	 */
	public String getOp() {
		return op;
	}

	/**
	 * @param op the op to set
	 */
	public void setOp(String op) {
		this.op = op;
	}

	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		this.r = r;
	}

	
	/**
	 * Add
	 * 
	 * @param a
	 * @param b
	 * @return r
	 */
	public double sum(double a, double b) {
		r = a + b;
		return r;
	}

	/**
	 * Substract
	 * 
	 * @param a
	 * @param b
	 * @return r
	 */
	public double rest(double a, double b) {
		r = a - b;
		return r;
	}

	/**
	 * Multiply
	 * 
	 * @param a
	 * @param b
	 * @return r
	 */
	public double multiplication(double a, double b) {
		r = a * b;
		return r;
	}

	/**
	 * Split
	 * 
	 * @param a
	 * @param b
	 * @return r
	 */
	public double division(double a, double b) {
		r = a / b;
		return r;
	}
	
	
	/**
	* Square Root
	* 
	* @param a
	* @return r
	*/
	public double squareRoot(double a) {
		r = Math.sqrt(a);
	    return r;
	}	
	
	
}
