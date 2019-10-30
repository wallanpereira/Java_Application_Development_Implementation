package cap_02;

import java.io.DataInputStream;

public class EntradaComDataInputStream {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String s;
		Float largura, comprimento, area, perimetro;
		DataInputStream dado = new DataInputStream(System.in);
		try {
			System.out.println("Entre com o comprimento");
			s = dado.readLine();
			comprimento = Float.parseFloat(s);
			
			System.out.println("Entre com a largura");
			s = dado.readLine();
			largura = Float.parseFloat(s);
			
			area = comprimento * largura;
			perimetro =  comprimento * 2 + largura * 2;
			System.out.println("Área do retângulo: " + area);
			System.out.println("Perimetro do retângulo: " + perimetro);
			
		} catch (Exception e) {
			System.out.println("Erro na entrada de dados" + e);
		}

	}

}
