package rest;

import api.FibService;
import api.FibResultado;
import rest_lib.FibResult;;
public class FibServImpl implements FibService{

	public FibResultado fibcalculate(int numero) {
		int resultado = FibResult.fibonacci(numero);
		return new FibResultado().withNum(numero).withFibonacci(resultado);
	}

	
}
