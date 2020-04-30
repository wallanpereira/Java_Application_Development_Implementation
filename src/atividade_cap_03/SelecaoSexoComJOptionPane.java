package atividade_cap_03;

import javax.swing.JOptionPane;

public class SelecaoSexoComJOptionPane {

	public static void main(String[] args) {
		// Exercicio_02 - figura_3.17

		Object[] op = { "Masculino", "Feminino" };
		String resp = (String) JOptionPane.showInputDialog(null, "Selecione um sexo:\n ", "Pesquisa",
				JOptionPane.QUESTION_MESSAGE, null, op, "Masculino");

		if (resp == null) {
			JOptionPane.showMessageDialog(null, "Você Cancelou!");
		} else if (resp.equals("Masculino")) {
			JOptionPane.showMessageDialog(null, "Você é homem");
		} else if (resp.equals("Feminino")) {
			JOptionPane.showMessageDialog(null, "Você é mulher");
		}
		System.exit(0);
	}
}
