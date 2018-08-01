import java.util.ArrayList;
import java.util.List;


public class carrinhoDeCompra {
	static int valorT = 0;
	public List<Object>	pizza = new ArrayList<Object>();
	

	void addCarrinho(Pizza p) {
		if(p.ingred.size() == 0) 
			System.out.println("A pizza adicionada não tem ingredientes");
		else
			pizza.add(p);
	}
	int getTotal() {
		for(int i=0;i<pizza.size();i+=1)
			valorT+= ((Pizza) pizza.get(i)).getPreco();
		return valorT;
	}
}
