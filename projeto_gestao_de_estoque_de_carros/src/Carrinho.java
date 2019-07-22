import exceptions.CarrosDemaisException;

public class Carrinho {

	
	myCollection<Pedido> dados = new myCollection<Pedido>();
	
	public void add(Automovel novo, int qtd) throws CarrosDemaisException{
		if(qtd>10)
			throw new CarrosDemaisException();
		this.dados.add(new Pedido(novo, qtd));
	}

	public void remove(int indexPedido, int qtd){
			int realIndex = indexPedido-1;
			Pedido p = this.get(realIndex);
			int qtdAtual = p.getQtd();
			p.setQtd(qtdAtual-=qtd);
			if (p.getQtd()>0)
				this.dados.update(realIndex, p);
			else
				this.dados.remove(this.dados.get(realIndex));
	}

	public Pedido[] getAll() {
		Pedido[] tmp = new Pedido[this.dados.size];
		for(int i=0;i < this.dados.size; i++) {			
			tmp[i] = this.dados.get(i);
		}
		return tmp;
	}
	
	public Pedido get(int i) {
		return this.dados.get(i);
	}
	
	public boolean have(Automovel a) {
		boolean retorno = false;
		for(Pedido p : this.getAll()) {
			if(			
					p.a.getModelo().equals(a.getModelo())
					&&  p.a.getPreco() == a.getPreco()
					&&  p.a.getTipo().equals(a.getTipo())
					&&  p.a.getCor().getValor().equals(a.cor.getValor())
					&& 	p.a.cor.getTipo().equals(a.cor.getTipo())
			) return true;
		}
		return retorno;
	}
	
	public void printAutomoveis() {
		int i = 0; 
		for(Pedido p: this.getAll()) {
			System.out.println(
					i+1+"__"+p.getQtd()+" "+p.a.modelo +" "+ p.a.cor.getValor() +" "+ p.a.cor.getTipo() + "\n"
			);
			i++;
		}
	}

}
