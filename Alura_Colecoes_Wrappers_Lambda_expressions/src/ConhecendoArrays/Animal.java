package ConhecendoArrays;

public class Animal implements Comparable<Animal>{

	String nome;
	int idade;
	String raca;
	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", idade=" + idade + ", raca=" + raca + "]";
	}

	public Animal(String nome, int idade, String raca) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getRaca() {
		return raca;
	}



	public void setRaca(String raca) {
		this.raca = raca;
	}


	@Override
	public int compareTo(Animal outro) {
		// TODO Auto-generated method stub
		return Integer.compare(this.idade, outro.getIdade());
	}

}
