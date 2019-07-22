package trabalhoPOO;

public class VerificaCampeao {
	
	private Mesa MesaDeVerificacao;
	
	VerificaCampeao(Mesa mesa){
		this.MesaDeVerificacao = mesa;
	}
	
	void addJogadasJogadores() {
		for(Jogador jogador : this.MesaDeVerificacao.getJogadores()) {
			this.verificaCartasComum(jogador.getCartasNaMao(), jogador);
			this.verificaFlush(jogador.getCartasNaMao(), jogador);
			
			if(jogador.haveJogada("Par") && jogador.haveJogada("Trinca"))
				jogador.addJogada(new Jogada("","Full House"));
			
		}
		
	}
	
	void verificaCartasComum(Carta[] cartasJogador, Jogador jogador) {
		
		String[] arrayValores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"} ;
		int[] arrayQuantidades = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } ;
		
		String valorC1 = cartasJogador[0].getValor();
		String valorC2 = cartasJogador[1].getValor();
		
		if( valorC1 == valorC2 ) {
			int indexOfValue = this.getIndexOf(arrayValores, valorC1);
			if(indexOfValue != -1)
				arrayQuantidades[indexOfValue]++;
		}
		
		for(Carta carta : this.MesaDeVerificacao.getCartasNaMesa()) {
			
			String valorCartaAtual = carta.getValor();
			
			if( valorCartaAtual == valorC1 ) {
				int indexOfValue = this.getIndexOf(arrayValores, valorC1);
				if(indexOfValue != -1)
					arrayQuantidades[indexOfValue]++;
			}
			else if( valorCartaAtual == valorC2 ) {
				int indexOfValue = this.getIndexOf(arrayValores, valorC2);
				if(indexOfValue != -1)
					arrayQuantidades[indexOfValue]++;
			}
			
		}
		
		for( int indexValor : this.getIndexOf(arrayQuantidades, 1) ) {
			jogador.addJogada(new Jogada(arrayValores[indexValor], "Par"));
		}
		
		for( int indexValor : this.getIndexOf(arrayQuantidades, 2) ) {
			jogador.addJogada(new Jogada(arrayValores[indexValor], "Trinca"));
		}
		
		int[] arrayTeste = this.getIndexOf(arrayQuantidades, 3);
		
		if(arrayTeste.length == 1) {
			jogador.addJogada(new Jogada(arrayValores[arrayTeste[0]], "Four"));
		}
		
	}

	void verificaFlush(Carta[] cartasJogador, Jogador jogador) {
		
		String[] arrayValores = { "paus", "ouros", "copas", "espadas"} ;
		int[] arrayQuantidades = { 0, 0, 0, 0 } ;
		
		String nipeC1 = cartasJogador[0].getNipe();
		String nipeC2 = cartasJogador[1].getNipe();
		
		if(nipeC1 == nipeC2) {
			int indexArray = this.getIndexOf(arrayValores, nipeC1);
			if(indexArray != -1)
				arrayQuantidades[indexArray]++;
		}
		
		for(Carta carta : this.MesaDeVerificacao.getCartasNaMesa()) {
			String nipeCartaAtual = carta.getNipe();
			
			if( nipeCartaAtual == nipeC1 ) {
				int indexOfNipe = this.getIndexOf(arrayValores, nipeC1);
				if(indexOfNipe != -1)
					arrayQuantidades[indexOfNipe]++;
			}
			else if( nipeCartaAtual == nipeC2 ) {
				int indexOfNipe = this.getIndexOf(arrayValores, nipeC2);
				if(indexOfNipe != -1)
					arrayQuantidades[indexOfNipe]++;
			}
			
		}
		
		for( int indexValor : this.getIndexOf(arrayQuantidades, 4) ) {
			jogador.addJogada(new Jogada(arrayValores[indexValor], "Flush"));
		}
		
	}
	
	void verificaSequencia(Carta[] cartasDoJogador, Jogador jogador) {
//		TODO
	}
	
	
// get index of an array methods
	
	int getIndexOf(String[] array, String value) {
		int index = 0;
		
		for (String item : array) {
			if(item == value)
				return index;
			index++;
		}
		return -1;
	}
	
	int[] getIndexOf(int[] array, int value) {
		int index = 0;
		int topo = 0;
		int[] counter = new int[array.length] ;
		int[] retornoVazio = {};
		
		for (int item : array) {
			if(item == value) {
				counter[topo] = index;
				topo++;
			}
			
			index++;
		}
		
		int[] retorno = new int[topo];
		int topoRetorno = 0;
		
		for(int i=0;i<counter.length;i++) {
			if(counter[i]!= 0) {
				retorno[topoRetorno] = counter[i];
				topoRetorno++;
			}
		}
			
		
		if(topo!=0)
			return retorno;
		else
			return retornoVazio;
	}
}
