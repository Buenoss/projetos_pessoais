
public abstract class Automovel {
	protected double preco;
	protected Cor cor;
	protected String tipo;
	protected String modelo;
	
	Automovel(Cor cor, double preco, String tipo){
		if(cor.getTipo().equals("fosco")) {			
			this.preco = preco * 1.03;
		}else {
			this.preco = preco;
		}
		this.cor = cor;
		this.tipo = tipo;
	}
	
	public Cor getCor() {
		return this.cor;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
}
