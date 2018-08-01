
public class Autoridade implements FormatadorNome{
	String nome;
	String sobrenome;
	FormatadorNome tratamento;
	

	public Autoridade(String nome, String sobrenome, FormatadorNome tratamento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tratamento = tratamento;
	}


	@Override
	public String formatarNome(String nome, String sobrenome) {		
		return this.tratamento.formatarNome(nome, sobrenome);
	}


}
