package api;

public class FibResultado {
	
	private int num;
	private int fibonacci;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public FibResultado withNum (int num) {
		this.num = num;
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
