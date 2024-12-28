package br.com.exercicio1.principal;

import br.com.exercicio1.excecao.DivisaoPorZeroException;
import br.com.exercicio1.modelos.ResultadoDivisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n1 = lerInteiro(teclado);
        int n2 = lerInteiro(teclado);

            ResultadoDivisao resultado = dividirNumeros(n1, n2);
            if (resultado.isResultadoLogico() == false) {
                System.out.println("Não foi possível concluir a divisão");
            } else {
                System.out.println("Resultado: " + resultado.getResultadoNumerico());
            }

            teclado.close();
    }
    public static int lerInteiro (Scanner scanner){
        while(true) {
            System.out.println("Digite um número inteiro");
            try {
                return scanner.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Entrada inválida. Digite apenas números");
                scanner.next();
            }
        }
    }

    public static ResultadoDivisao dividirNumeros(int n1, int n2){
        try {
            if (n2 == 0) {
                throw new DivisaoPorZeroException("Divisão por zero é inválida. Não é possível dividir " + n1 + " por " + n2);

            } else {
                return new ResultadoDivisao(n1/n2, true);
            }
        } catch(DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
            return new ResultadoDivisao(-1, false);
        }
    }
}
