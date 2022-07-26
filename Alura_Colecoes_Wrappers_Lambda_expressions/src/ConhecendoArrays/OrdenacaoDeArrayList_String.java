package ConhecendoArrays;

import java.util.ArrayList;
import java.util.Comparator;

public class OrdenacaoDeArrayList_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<String> listaDeNomes = new ArrayList<String>();
		
		listaDeNomes.add("Wendel");
		listaDeNomes.add("Leticia");
		listaDeNomes.add("Dobi");
		listaDeNomes.add("Bidu");
		
		System.out.println(" Antes");
		System.out.println(listaDeNomes);
		
		//OrdenacaoDeNomes ordenarNomes = new OrdenacaoDeNomes();
		
		/*listaDeNomes.sort(new Comparator<String>(){
			
			public int compare(String nome1, String nome2) {
				return nome1.compareTo(nome2);
			}
		});*/
		
		/*listaDeNomes.sort((String nome1, String nome2) -> {
				return nome1.compareTo(nome2);
		});*/
		
		listaDeNomes.sort((nome1, nome2) -> nome1.compareTo(nome2));
		
		
		System.out.println("\n Depois");
		
		listaDeNomes.forEach((nomes) -> System.out.println(nomes));
	}

}
/*
class OrdenacaoDeNomes implements Comparator<String>{
	
	public int compare(String nome1, String nome2) {
		return nome1.compareTo(nome2);
	}
	
}
*/