package br.com.praticatrycatch.principal;

import br.com.praticatrycatch.excecao.DivisaoPorZeroException;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite o primeiro número: ");
            int n1 = teclado.nextInt();

            System.out.println("Digite o segundo número: ");
            int n2 = teclado.nextInt();

            try {
                if (n2 <= 0) {
                    throw new DivisaoPorZeroException("Não é possível dividir por zero ou números negativos");
                }

                int resultado = n1/n2;
                System.out.println("Resultado:" + resultado);
            } catch(DivisaoPorZeroException e) {
                System.out.println(e.getMessage());
            }
    }
}
