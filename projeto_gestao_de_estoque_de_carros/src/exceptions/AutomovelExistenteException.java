package exceptions;

public class AutomovelExistenteException extends Exception{
	
	public AutomovelExistenteException(){
		super("Automovel já existe!");
	}
}
