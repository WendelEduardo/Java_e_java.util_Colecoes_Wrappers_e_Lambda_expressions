package ConhecendoArrays;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TesteWendel {
	public static void main(String[] args) {
		
		ArrayList<String> ListaDeConvidados = new ArrayList<String>();
		
		for(int i=0; i<4; i++) {
			ListaDeConvidados.add(JOptionPane.showInputDialog("Digite o nome do convidado: "));
		}
		
		ListaDeConvidados.forEach( (nomes) -> JOptionPane.showMessageDialog(null, nomes));
		
		ListaDeConvidados.sort( (nome1, nome2) -> nome1.compareTo(nome2));
		
		JOptionPane.showMessageDialog(null, "Lista ordenada");
		ListaDeConvidados.forEach( (nomes) -> JOptionPane.showMessageDialog(null, nomes));
	}
}
