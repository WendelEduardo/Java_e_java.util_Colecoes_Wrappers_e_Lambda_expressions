package ConhecendoArrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Classe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa[] pessoas = new Pessoa[2];
		pessoas[0] = new Pessoa("Wendel", 19);
		pessoas[1] = new Pessoa("Leticia", 20);
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}

		System.out.println("------------------------");

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<String> letras = new ArrayList<String>();
		numeros.add(2);
		numeros.add(1);
		letras.add("A");
		letras.add("b");
		System.out.println(numeros + "\n" + letras);
		System.out.println(numeros.size());
		System.out.println(numeros.get(1));
		System.out.println("Removendo: " + letras.remove(1));

		Collection limitado = new ArrayList(6);

		System.out.println(numeros.contains(3));
		System.out.println(numeros.get(0).equals(2));

		System.out.println("----------- List e LinkedList -------------");

		List numeros2 = new ArrayList();
		numeros2.add(12);

		ArrayList<Animal> animais = new ArrayList<Animal>();
		animais.add(new Animal("Animalzinho 1", 2, "Cachorro"));
		animais.add(new Animal("Animalzinho 2", 1, "Pinguim"));
		animais.add(new Animal("Animalzinho 3", 10, "Papaguaio"));
		
		System.out.println(animais);
		
		animais.sort(null);
		
		System.out.println(animais);
	}

}
