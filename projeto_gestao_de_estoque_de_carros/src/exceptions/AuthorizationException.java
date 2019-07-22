package exceptions;

public class AuthorizationException extends Exception{
	public AuthorizationException(){
		super("Erro de autorização, senha  incorreta!");
	}
}
