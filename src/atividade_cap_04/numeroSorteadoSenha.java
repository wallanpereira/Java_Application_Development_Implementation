package atividade_cap_04;

import javax.swing.*;

public class numeroSorteadoSenha {
    public static void main(String[] args) {

        /* Uma pequena correção: 5+(int)( 6*Math.random() ) -
         * O cast deve ser feito depois da multiplicação, senão retorna sempre zero - multiplique por 6 pq o método retorna um numero de 0 a menor que 1, nunca retorna 1, então jamais daria 10.
         */
        int numeroSorteado = (int) (Math.random() * 6) + 5;
        String senha = "";

        for (int i = 0; i < numeroSorteado; i++) {
            int numero = (int) (Math.random() * 9);
            senha += numero;
        }
        JOptionPane.showMessageDialog(null,"Numero sorteado: " + numeroSorteado + "\nSenha: " + senha);
        System.exit(0);
    }
}
