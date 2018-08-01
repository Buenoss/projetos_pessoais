import java.util.*;

public class Pizza {
	public int ningredientes =0;
	public List <String> ingred = new ArrayList<String>();
	public static HashMap<String,Integer> inggastos = new HashMap<String,Integer>();
	
	void adicionaIngrediente(String nomeing) {
		ningredientes++;
		ingred.add(nomeing);
		contabilizaIngrediente(nomeing);
	}
	public void contabilizaIngrediente(String nomeing) {
		if(inggastos.containsKey(nomeing)) {
			int a = inggastos.get(nomeing);
			inggastos.put(nomeing, a+1);
		}
		else {
			inggastos.put(nomeing, 1);
		}
	}
	public int getPreco() {
		ningredientes = ingred.size();
		if(ningredientes ==0)
			return 0;
		if(ningredientes<=2)
			return 15;
		
		else if(ningredientes>=3 && ningredientes<=5)
			return 20;
		else
			return 23;
	}
	
}
