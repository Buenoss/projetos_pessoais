import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class testeProduto {
	static Produto p1;
	static Produto p2;
	static Produto p3;
	static Produto p4;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		p1 = new Produto("Camisa", 123, 15);
		p2 = new Produto("sapato", 153, 50);
		p3 = new Produto("boné", 147, 30);
		p4 = new Produto("shorts", 223, 35);
	}

	@Test
	public void testNome() {
		assertEquals(p1.getNome(),"Camisa");
		assertEquals(p2.getNome(),"sapato");
		assertEquals(p3.getNome(),"boné");
		assertEquals(p4.getNome(),"shorts");
	}
	@Test
	public void testPreco() {
		assertEquals(p1.getPreco(),15);
		assertEquals(p2.getPreco(),50);
		assertEquals(p3.getPreco(),30);
		assertEquals(p4.getPreco(),35);
	}
	@Test
	public void testCodigo() {
		assertEquals(p1.getCodigo(),123);
		assertEquals(p2.getCodigo(),153);
		assertEquals(p3.getCodigo(),147);
		assertEquals(p4.getCodigo(),223);
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