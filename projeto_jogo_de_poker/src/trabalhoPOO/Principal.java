package trabalhoPOO;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Baralho baralhoDoJogo = new Baralho();
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		if(n<=9 && n>=0) {
			Jogador Jogadores[] = new Jogador[n];
			
			for (int i = 0; i < n; i++) {
				Jogadores[i] = new Jogador(sc.nextLine());
			}
			
			baralhoDoJogo.embaralhar();
			
			Mesa MesaDoJogo = new Mesa(Jogadores);
			
			for (int i = 0; i < 2*n ; i++) {
				MesaDoJogo.distribuiCarta(baralhoDoJogo.getCartaTopo());
				baralhoDoJogo.discartaCarta();
			}
			
			for (int i = 0; i < 5; i++) {
				MesaDoJogo.adcionaCartaNaMesa(baralhoDoJogo.getCartaTopo());
				baralhoDoJogo.discartaCarta();
			}
			
			VerificaCampeao vf =  new VerificaCampeao(MesaDoJogo);
			vf.addJogadasJogadores();
			
			MesaDoJogo.printJogadoresECartasNaMesa();
			
		}else {
			System.out.println("O jogo deve ter no máximo 9 jogadores!");
		}
		
	}

}
