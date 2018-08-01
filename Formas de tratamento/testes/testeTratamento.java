import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testeTratamento {
	
	Autoridade autoridade;
	FormatadorNome formaDtratamento;
	String titulo;
	
	@Test
	public void testInformal() {
		formaDtratamento = new Informal();
		autoridade = new Autoridade("scooby","doo", formaDtratamento);
		
		assertEquals("scooby", autoridade.formatarNome("scooby","doo"));
	}
	@Test
	public void testRespeitosoMasc() {
		formaDtratamento = new Respeitoso(true);
		autoridade = new Autoridade("scooby","doo", formaDtratamento);
		
		assertEquals("Sr.doo", autoridade.formatarNome("scooby","doo"));
	}
	@Test
	public void testRespeitosoFem() {
		formaDtratamento = new Respeitoso(false);
		autoridade = new Autoridade("olivia","palito", formaDtratamento);
		
		assertEquals("Sra.palito", autoridade.formatarNome("olivia","palito"));
	}
	@Test
	public void testComTitulo() {
		formaDtratamento = new ComTitulo("O pica das galáxias");
		autoridade = new Autoridade("scooby","doo", formaDtratamento);
		
		assertEquals("O pica das galáxias scooby doo", autoridade.formatarNome("scooby","doo"));
	}

}
