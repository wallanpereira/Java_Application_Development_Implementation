package atividade_cap_03;

import javax.swing.JOptionPane;

public class CapturandoErroCompleto {

	public static void main(String[] args) {
		// Exemplo 3.9
		int x = Integer.parseInt(JOptionPane.showInputDialog("Forne�a um n�mero: "));
		try {
			int y = x / 0;
		} catch (Exception e) {
			// TODO: handle exception
			// Retorna o erro ocorrido / by Zero
			JOptionPane.showMessageDialog(null, e.getMessage());
			// retorna informa��es como tipo exce��o, mensagem de erro e nome da classe
			e.printStackTrace();
		}

	}

}
