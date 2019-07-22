import exceptions.AuthorizationException;

public class Auth extends SuperScanner{
	String pass = "123";
	
	public void verifyAuthorization() throws AuthorizationException {
		if(sc.nextLine().equals(this.pass)) {
		}else {
			throw new AuthorizationException();
		}
	}
}
