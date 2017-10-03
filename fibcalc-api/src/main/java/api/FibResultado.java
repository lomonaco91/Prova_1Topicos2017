package api;

public class FibResultado {
	
	private int number;
	private int fibonacci;
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public FibResultado withNum (int number) {
		this.number = number;
		return this;
	}
	
	public int getFibonnaci() {
		return fibonacci;
	}
	
	public void setFibonnaci(int fibonnaci) {
		this.fibonacci = fibonnaci;
	}
	
	public FibResultado withFibonacci(int fibonacci) {
		this.fibonacci = fibonacci;
		return this;
	}
	
	

}
