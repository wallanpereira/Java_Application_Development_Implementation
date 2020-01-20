package atividade_cap_03;

import javax.swing.JOptionPane;

public class CapturandoErroCompleto {

	public static void main(String[] args) {
		// Exemplo 3.9
		int x = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número: "));
		try {
			int y = x / 0;
		} catch (Exception e) {
			// TODO: handle exception
			// Retorna o erro ocorrido / by Zero
			JOptionPane.showMessageDialog(null, e.getMessage());
			// retorna informações como tipo exceção, mensagem de erro e nome da classe
			e.printStackTrace();
		}

	}

}
