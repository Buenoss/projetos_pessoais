import exceptions.AutomovelExistenteException;

public class AutomoveisBank implements Storage{

	myCollection<Automovel> dados = new myCollection<Automovel>();
	
	@Override
	public void add(Automovel a) throws AutomovelExistenteException{
		for(Automovel a2 : this.getAll()) {
			if(
					a2.getModelo().equals(a.getModelo())
				&&  a2.getPreco() == a.getPreco()
				&&  a2.getTipo().equals(a.getTipo())
				&&  a2.getCor().getValor().equals(a.cor.getValor())
				&& a2.cor.getTipo().equals(a.cor.getTipo())
				
			)
				throw new AutomovelExistenteException();
		}
		this.dados.add(a);
	}

	@Override
	public void remove(Automovel a) {
		this.dados.remove(a);
	}

	@Override
	public Automovel[] getAll() {
		Automovel[] tmp = new Automovel[this.dados.size];
		for(int i=0;i < this.dados.size; i++) {			
			tmp[i] = this.dados.get(i);
		}
		return tmp;
	}
	
	@Override
	public Automovel get(int i) {
		return this.dados.get(i);
	}

}
