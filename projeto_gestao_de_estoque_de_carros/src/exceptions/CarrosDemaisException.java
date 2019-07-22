package exceptions;

public class CarrosDemaisException extends Exception{
	
	public CarrosDemaisException() {
		super("você não pode levar tantos carros");
	}
}
