package br.com.praticatrycatch.principal;

import excecao.DivisaoPorZeroException;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite o primeiro número: ");
            double n1 = teclado.nextDouble();

            System.out.println("Digite o segundo número: ");
            double n2 = teclado.nextDouble();

            double resultado = n1/n2;
        } catch (DivisaoPorZeroException e) {
           throw new DivisaoPorZeroException
        }
    }
}
