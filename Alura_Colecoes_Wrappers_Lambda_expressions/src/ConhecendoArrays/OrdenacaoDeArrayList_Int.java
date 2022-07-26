package ConhecendoArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class OrdenacaoDeArrayList_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(4);
		numeros.add(7);
		numeros.add(1);
		numeros.add(10);
		numeros.add(-2);

		System.out.println(" Antes da Ordenação");
		System.out.println(numeros);

		//OrdenacaoDeNumeros ordenar = new OrdenacaoDeNumeros();
		
		//numeros.sort(new OrdenacaoDeNumeros());
		
		//Collections.sort(numeros, new OrdenacaoDeNumeros());
		
		/*numeros.sort( (Integer n1, Integer n2) ->{
			return Integer.compare(n1, n2);
		});*/
		
		numeros.sort((n1, n2) -> Integer.compare(n1, n2));

		System.out.println("\n Depois da Ordenação");

		numeros.forEach((number) -> System.out.println(number));
		
	}
}

class OrdenacaoDeNumeros implements Comparator<Integer> {

	@Override
	public int compare(Integer n1, Integer n2) {
		
		return Integer.compare(n1, n2);
		
		//return n1 - n2;
		
		/*if (n1 > n2) {
			return 1;
		} else {
			return -1;
		}*/
	}

}
