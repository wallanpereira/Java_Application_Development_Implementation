package cap_02;

import java.util.Scanner;

public class MatrizTeste {

	private static Scanner scanner;

	public static void main(String[] args) {
		float preco;
		String nomeProduto;
		int cod;

		String procedencia[] = { "Sul", "Norte", "Leste", "Oeste", "Nordeste", "Sudeste", "Centro-Oeste", "Importado" };
		String frase;
		System.out.print("Digite o nome do produto: ");
		scanner = new Scanner(System.in);
		nomeProduto = scanner.nextLine();

		System.out.print("Digite o valor: ");
		preco = scanner.nextFloat();

		System.out.print("Digite o código de origem: ");
		cod = (int) scanner.nextInt();

		frase = "Produto: " + nomeProduto + " R$" + preco + " Origem: ";
		if (cod > 0 && cod != 0) {
			if (cod == 1) {
				System.out.println(frase + procedencia[0]);
			} else if (cod == 2) {
				System.out.println(frase + procedencia[1]);
			} else if (cod == 3) {
				System.out.println(frase + procedencia[2]);
			} else if (cod == 4) {
				System.out.println(frase + procedencia[3]);
			} else if (cod == 5 || cod == 6) {
				System.out.println(frase + procedencia[4]);
			} else if (cod == 5 || cod == 6) {
				System.out.println(frase + procedencia[4]);
			} else if (cod >= 7 && cod <= 9) {
				System.out.println(frase + procedencia[5]);
			} else if (cod >= 10 && cod <= 20) {
				System.out.println(frase + procedencia[6]);
			} else if (cod >= 25 && cod <= 30) {
				System.out.println(frase + procedencia[7]);
			} else {
				System.out.println(frase + procedencia[8]);
			}
		} else {
			System.out.println("Código invalido!");
		}
	}
}
