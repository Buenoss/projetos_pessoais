
public class Pedido extends SuperScanner{
	
	private int qtd=0;
	public Automovel a;
	
	Pedido(Automovel a, int qtd) {
		this.qtd = qtd;
		this.a = a;
	}
	
	public int getQtd () {
		return this.qtd;
	}
	
	public void setQtd (int qtd) {
		this.qtd = qtd;
	}
}
