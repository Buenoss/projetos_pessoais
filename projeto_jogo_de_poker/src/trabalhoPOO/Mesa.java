package trabalhoPOO;

public class Mesa {
	private Jogador JogadoresDoJogo[];
	private Carta cartasDaMesa[] = new Carta[5];
	private int indexJogador=0;
	private int indexCartaMesa=0;
	
	Mesa(Jogador jogadores[]){
		this.JogadoresDoJogo = jogadores;
	}
	
	Jogador[] getJogadores() {
		return this.JogadoresDoJogo;
	}
	
	Carta[] getCartasNaMesa() {
		return this.cartasDaMesa;
	}
	
	void distribuiCarta(Carta carta) {
		this.JogadoresDoJogo[indexJogador].setCarta(carta);
		
		if(this.indexJogador == this.JogadoresDoJogo.length-1)
			this.indexJogador=0;
		else
			this.indexJogador++;
	}
	
	void adcionaCartaNaMesa (Carta carta) {
		this.cartasDaMesa[this.indexCartaMesa] = carta;
		this.indexCartaMesa++;
	}
	
	void printJogadoresECartasNaMesa() {
		System.out.println("Jogadores:");
		for(Jogador jogador: JogadoresDoJogo) {
			System.out.print(jogador.getNome()+" cartas: ");
			for(Carta carta : jogador.getCartasNaMao() ) {
				System.out.print( carta.getNipe() + " "+ carta.getValor() + " " );
			}
			System.out.print("jogadas: ");
			for(Jogada jogada : jogador.getJogadasJogador()) {
				if(jogada!=null)
					System.out.print(jogada.getTipo()+" "+ jogada.getValor() +" " );
			}
			System.out.println();
		}
		System.out.println("Cartas da Mesa:");
		for(Carta carta: cartasDaMesa) {
			System.out.println( carta.getNipe() + " " + carta.getValor() );
		}
	}
	
}
