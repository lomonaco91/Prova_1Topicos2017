package rest;

import api.FibService;
import api.FibResultado;
import rest_lib.FibResult;;
public class FibServImpl implements FibService{

	public FibResultado fibCalc(int num) {
		int res = FibResult.fibonacci(num);
		return new FibResultado().withNum(num).withFibonacci(res);
	}

	
}
