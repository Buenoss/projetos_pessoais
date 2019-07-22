package trabalhoPOO;

public class Carta {
	private String nipe = "";
	private String valor = "";
	
	Carta(String nipe, String valor){
		this.nipe = nipe;
		this.valor = valor;
	}
	
	public String getNipe() {
		return this.nipe;
	}
	
	public String getValor() {
		return this.valor;
	}
}
