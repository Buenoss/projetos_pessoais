import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestePizza {
	Pizza p;
	
	carrinhoDeCompra c;
	@Before
	public void inicializaPizza() {
		p = new Pizza();
	}
	@After
	public void finalizaPizza() {
		Pizza.zeraIngredientes();
	}
	@Test
	public void testPrecoPizza() {
		assertEquals(0, p.getPreco());
		p.adicionaIngrediente("tomate");
		assertEquals(15, p.getPreco());
		p.adicionaIngrediente("tomate");
		p.adicionaIngrediente("tomate");
		assertEquals(20, p.getPreco());
		p.adicionaIngrediente("tomate");
		p.adicionaIngrediente("tomate");
		p.adicionaIngrediente("tomate");
		assertEquals(23, p.getPreco());
	}
	
	@Test
	public void testeIngredientes() {
		p.adicionaIngrediente("rucula");
		int a =Pizza.inggastos.get("rucula");
		p.adicionaIngrediente("bacon");
		int b =Pizza.inggastos.get("bacon");
		assertEquals(1, a);
		assertEquals(1, b);
	}
	@Test
	public void testeCarrinho() {
		c = new carrinhoDeCompra();
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p0 = new Pizza();
		
		p2.adicionaIngrediente("tomate");
		p2.adicionaIngrediente("tomate");
		p2.adicionaIngrediente("tomate");
		
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("tomate");
		
		p.adicionaIngrediente("tomate");
		
		c.addCarrinho(p);
		c.addCarrinho(p1);
		c.addCarrinho(p2);
		c.addCarrinho(p0);
		
		assertEquals(58,c.getTotal());
	}
	

}
