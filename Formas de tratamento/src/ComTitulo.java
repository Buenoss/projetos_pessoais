
public class ComTitulo implements FormatadorNome {
	
	private String titulo;
	
	ComTitulo(String titulo){
		super();
		this.titulo=titulo;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		return this.titulo+" "+nome+" "+sobrenome;
	}



}
