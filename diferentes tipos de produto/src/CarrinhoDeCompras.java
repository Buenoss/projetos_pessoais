import java.util.*;

public class CarrinhoDeCompras {
	private static HashMap<ProdutoComTamanho,Integer> carrinho = new HashMap<ProdutoComTamanho,Integer>();
	private static HashMap<ProdutoComTamanho,Integer> carrinhoZ = new HashMap<ProdutoComTamanho,Integer>();
	int valorT;
	
	public void adicionaProduto(ProdutoComTamanho p, int quantidade) {
		contabilizaProduto(p, quantidade);
	}
	public void contabilizaProduto(ProdutoComTamanho p, int quant) {
		if(carrinho.containsKey(p)) {
			int soma = carrinho.get(p);
			carrinho.put(p, soma + quant);
		}
		else {
			carrinho.put(p,quant);
		}
	}
	
	public void removeProduto(ProdutoComTamanho p, int quant) {
		if(carrinho.containsKey(p)) {
			if(carrinho.get(p)>0) {
				int som = carrinho.get(p);
				carrinho.put(p, som - quant);
			}
			else
				System.out.println("erro, produto não está mais no carrinho!");
			}
		else {
			System.out.println("erro, produto não está no carrinho!");
		}
	}
	public int calculaValorTotal(){

			for(int i=0;i<carrinho.size();i+=1) 
				valorT= valorT + ((ProdutoComTamanho)carrinho.get(i)).getPreco()*carrinho.get(i);
			return valorT;	
			
	}
	public void zerar() {
		carrinho=carrinhoZ;
	}
	
}
