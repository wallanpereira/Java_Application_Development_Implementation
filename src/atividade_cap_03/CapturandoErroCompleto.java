package atividade_cap_03;

import javax.swing.JOptionPane;

public class CapturandoErroCompleto {

	private static int y;

	public static void main(String[] args) {
		// Exemplo 3.9
		int x = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número: "));
		try {
			setY(x / 0);
		} catch (Exception e) {
			// Retorna o erro ocorrido / by Zero
			JOptionPane.showMessageDialog(null, e.getMessage());
			// retorna informações como tipo exceção, mensagem de erro e nome da classe
			e.printStackTrace();
		}

	}

	public static int getY() {
		return y;
	}

	public static void setY(int y) {
		CapturandoErroCompleto.y = y;
	}

}
