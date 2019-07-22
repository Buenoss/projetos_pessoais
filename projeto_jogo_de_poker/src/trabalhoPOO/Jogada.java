package trabalhoPOO;

public class Jogada {
	private String tipo;
	private String valor;
	
	Jogada(String tipo, String valor){
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getValor() {
		return valor;
	}
	
}
