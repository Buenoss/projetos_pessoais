package trabalhoPOO;

import java.util.Random;

public class Baralho {
	Carta CartasDoBaralho[] = new Carta[52];
	String Nipes[] = { "paus", "ouros", "copas", "espadas"};
	String Valores[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	int topo = 51;
	
	Baralho() {
		int i=0;
		for (String nipe : Nipes) {
			for (String valor: Valores) {
				CartasDoBaralho[i] = new Carta(nipe, valor);
				i++;
			}
		}
	}
	
	void embaralhar() {
		Carta baralhoEmbaralhado[] = new Carta[52];
		int i=0;
		
		for(Carta carta : CartasDoBaralho) {
			baralhoEmbaralhado[i] = carta;
			i++;
		}
		
		for(int j=0;j<baralhoEmbaralhado.length;j++) {
			int index = new Random().nextInt(baralhoEmbaralhado.length);
			Carta a = baralhoEmbaralhado[j];
			baralhoEmbaralhado[j] = baralhoEmbaralhado[index];
			baralhoEmbaralhado[index] = a;
		}
		
		i=0;
		for(Carta carta: baralhoEmbaralhado) {
			this.CartasDoBaralho[i] = carta;
			i++;
		}
	}
	
	Carta getCartaTopo() {
		Carta retorno = CartasDoBaralho[this.topo];
		this.topo-=1;
		return retorno; 
	}
	
	void discartaCarta() {
		this.topo-=1;
	}

	void getCartas() {
		for(Carta carta : CartasDoBaralho) {
			System.out.println(carta.getNipe() + " " + carta.getValor());
		}
	}
}
