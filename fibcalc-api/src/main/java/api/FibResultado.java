package api;

public class FibResultado {
	
	private int number;
	private int fibonacci;
	
	public int getNum() {
		return number;
	}
	
	public void setNum(int num) {
		this.number = num;
	}
	
	public FibResultado withNum (int num) {
		this.number = num;
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
