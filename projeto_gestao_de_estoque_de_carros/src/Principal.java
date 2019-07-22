import java.util.Scanner;

import exceptions.AuthorizationException;
import exceptions.AutomovelExistenteException;
import exceptions.CarrosDemaisException;
import exceptions.EndOfProgramException;

public class Principal {

	public static void main(String[] args) {
		
		Auth testAuth = new Auth();
		Scanner sc =  new Scanner(System.in);
		Storage carStock = new AutomoveisBank();
		Carrinho carrinho = new Carrinho();
		
		try {
			carStock.add(new Carro(new Cor("azul","fosco"), 32000.00, "Corsa" ));
			carStock.add(new Carro(new Cor("azul","metalizada"), 31000.00, "Corsa" ));
			carStock.add(new Carro(new Cor("vermelho","fosco"), 30000.00, "hb20" ));
		}catch( AutomovelExistenteException ae) {
			System.out.println("deu certo");
		}
		
		while(true) {
			try {
				System.out.println(	"Digite uma opção:" );
				System.out.println(	"1. Cadastrar automóveis" /*(acesso restrito com senha: 123)*/);
				System.out.println(	"2. Listar automóveis" );
				System.out.println(	"3. Adicionar automóveis ao carrinho com sua quantidade e cor" );
				System.out.println(	"4. Visualizar o carrinho" );
				System.out.println(	"5. Excluir automóvel do carrinho" );
				System.out.println(	"6. Finalizar a compra" );
				System.out.println(	"7. Consultar pedido" /*(usando o número gerado)*/);
				System.out.println(	"8. Listar compras realizadas" /*(acesso restrito com senha: 123)*/);
				System.out.println(	"9. Sair");
				
				
				int entrada = Integer.parseInt(sc.nextLine());
				switch(entrada) {
					case 1:
						try {
							testAuth.verifyAuthorization();
							System.out.println("Digite a cor(se é fosco ou metalizado), o preço e o nome do modelo:");
							try {								
								carStock.add(new Carro(new Cor(sc.nextLine(),sc.nextLine()), Double.parseDouble(sc.nextLine()), sc.nextLine()));				
							}catch(AutomovelExistenteException ae) {
								System.out.println("Automóvel já cadastrado, por favor insira outro!");
							}
						}catch (AuthorizationException ae) {
							System.out.println("Senha incorreta, tente novamente!");
						}
					break;
					case 2:
						System.out.println("Todos os automóveis:");
						int i = 0;
						for(Automovel a: carStock.getAll()) {
							System.out.print(i+1 + "_");
							System.out.println(
									"Tipo: " + a.getTipo() + "\n" +
									"Modelo: " + a.getModelo() + "\n"
									+ "cor: " + a.getCor().getValor() + " " + a.getCor().getTipo()
									+ " preço: " + a.getPreco()
									+ "\n"
							);
							i++;
						}
					break;
					case 3:
						System.out.println("Todos os automóveis:");
						int j = 0;
						for(Automovel a: carStock.getAll()) {
							System.out.print(j+1 + "_");
							System.out.println(
									"Tipo: " + a.getTipo() + "\n" +
									"Modelo: " + a.getModelo() + "\n"
									+ "cor: " + a.getCor().getValor() + " " + a.getCor().getTipo()
									+ " preço: " + a.getPreco()
									+ "\n"
							);
							j++;
						}
						System.out.println("didite o número do carro:");
						Automovel novo = carStock.getAll()[Integer.parseInt(sc.nextLine())-1];
						System.out.println("digite a quantidade:");
						int qtd = Integer.parseInt(sc.nextLine());
						try {							
							carrinho.add(novo, qtd);
						}catch(CarrosDemaisException ce) {
							System.out.println("Você deve colocar menos de 10 carros");
						}
					break;
					case 4:
						for(Pedido p: carrinho.getAll()) {
							String plural = (p.getQtd() > 1)?"s":"";
							System.out.println(
									p.getQtd() +" "+ p.a.modelo +  plural + "\n" +
									"de cor "+ p.a.cor.getValor() + " " +p.a.cor.getTipo() + "\n"
							);
						}
					break;
					case 5:
						carrinho.printAutomoveis();
						System.out.println("digite o número do Automóveis que você deseja retirar:");
						int indexPedido = Integer.parseInt(sc.nextLine());
						System.out.println("digite a quantidade de Automóveis que você deseja retirar:");
						int qtdA = Integer.parseInt(sc.nextLine());
						carrinho.remove(indexPedido,qtdA);
					break;
					case 6:
						//TODO finalizar compra
					break;
					case 7:
						//TODO consultar pedido
					break;
					case 8:
						try {
							testAuth.verifyAuthorization();
							//TODO implementar listar compras realizadas
						}catch (AuthorizationException ae) {
							System.out.println("Senha incorreta, tente novamente!");
						}
					break;
					case 9:
						throw new EndOfProgramException();
					default: System.out.println("Opção não encontrada!");
				}
			}catch (NumberFormatException nfx) {
				System.out.println("Por favor digite uma entrada válida!");
			}catch (EndOfProgramException eope) {
				sc.close();
				System.out.println("Bye Bye!");
				break;
			}	
		}
	}

}
