
public class principal {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		
		carrinhoDeCompra carrinho = new carrinhoDeCompra();
		
		p1.adicionaIngrediente("calabresa");
		p1.adicionaIngrediente("salsinha");
		p1.adicionaIngrediente("bacon");
		p1.adicionaIngrediente("ovo");
		
		
		p2.adicionaIngrediente("cebola");
		p2.adicionaIngrediente("azeite");
		p2.adicionaIngrediente("mussarela");
		
		p3.adicionaIngrediente("bufala");
		p3.adicionaIngrediente("brocolis");
		p3.adicionaIngrediente("tomate seco");
		p3.adicionaIngrediente("alface");
		p3.adicionaIngrediente("bacon");
		
		carrinho.addCarrinho(p1);
		carrinho.addCarrinho(p2);
		carrinho.addCarrinho(p3);
		
		System.out.println("Seu pedido tem "+carrinho.pizza.size()+" pizzas!");
		System.out.println("O valor total da compra é de R$"+carrinho.getTotal()+",00");
		System.out.println("Os ingredientes gastos foram: "+Pizza.inggastos);
		
	}

}
