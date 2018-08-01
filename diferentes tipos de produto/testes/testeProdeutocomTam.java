import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class testeProdeutocomTam {
	static ProdutoComTamanho p1;
	static ProdutoComTamanho p2;
	static ProdutoComTamanho p3;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p1 = new ProdutoComTamanho("camisa", 134, 24, 2);
		p2 = new ProdutoComTamanho("camisa", 134, 24, 3);
		p3 = new ProdutoComTamanho("camisa", 134, 24, 1);
	}

	@Test
	public void test() {
		assertEquals(p1.getNome(), "camisa");
		assertEquals(p2.getNome(), "camisa");
		assertEquals(p3.getNome(), "camisa");
	}
	@Test
	public void testTamanho() {
		assertEquals(p1.getTamanho(), 2);
		assertEquals(p2.getTamanho(), 3);
		assertEquals(p3.getTamanho(), 1);
	}
	@Test
	public void testPreco() {
		assertEquals(p1.getPreco(), 24);
		assertEquals(p2.getPreco(), 24);
		assertEquals(p3.getPreco(), 24);
	}
	@Test
	public void testCodigo() {
		assertEquals(p1.getCodigo(), 134);
		assertEquals(p2.getCodigo(), 134);
		assertEquals(p3.getCodigo(), 134);
	}

	@Test
	public void testEquals()  throws Exception{
		assertEquals(p1.equals(p2),false);
		assertEquals(p2.equals(p3),false);
		assertEquals(p1.equals(p3),false);
	}
	@Test
	public void testEqualst()  throws Exception{
		assertEquals(p1.equals(p1),true);
		assertEquals(p2.equals(p2),true);
		assertEquals(p3.equals(p3),true);
	}
}
