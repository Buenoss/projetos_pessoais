
public class Respeitoso implements FormatadorNome {

	private boolean sexo;
	private String forma;
	
	Respeitoso(boolean sexo){
		super();
		if(sexo) {
			this.sexo = true;
		}
		if(!sexo){
			this.sexo=false;
		}
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(this.sexo) {
			this.forma = "Sr.";
		}
		if(!sexo) {
			this.forma = "Sra.";
		}
		
		return this.forma+sobrenome;
	}

}
