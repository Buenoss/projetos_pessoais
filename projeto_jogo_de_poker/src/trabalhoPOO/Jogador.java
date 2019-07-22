package trabalhoPOO;

public class Jogador {
	private Carta CartasNaMao[] = new Carta[2];
	private Jogada jogadas[] = new Jogada[5];
	private int indexJogada = 0;
	private int index = 0;
	public String nome = "";
	
	Jogador(String nome){
		this.nome = nome;
	}
	
	public Carta[] getCartasNaMao() {
		return this.CartasNaMao;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCarta(Carta carta) {
		this.CartasNaMao[index] = carta;
		index = 1;
	}
	
	public void addJogada(Jogada jogada) {
		this.jogadas[this.indexJogada] = jogada;
		this.indexJogada++;
	}
	
	public Jogada[] getJogadasJogador() {
		return this.jogadas;
	}
	
	public Boolean haveJogada(String nomeJogada) {
		
		for(Jogada jogada : this.jogadas) {
			if(jogada !=null && jogada.getTipo() == nomeJogada) return true;
		}
		
		return false;
	}
}
