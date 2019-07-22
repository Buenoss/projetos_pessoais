import exceptions.AutomovelExistenteException;

public interface Storage {
	
	public void add(Automovel a) throws AutomovelExistenteException;
	public void remove(Automovel a);
	public Automovel[] getAll();
	public Automovel get(int i);
}
