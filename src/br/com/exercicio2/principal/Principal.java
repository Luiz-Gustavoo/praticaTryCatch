package br.com.exercicio2.principal;

import br.com.exercicio2.excecoes.SenhaInvalidaException;
import br.com.exercicio2.modelos.ResultadoValidacaoSenha;
import br.com.exercicio2.modelos.ValidarSenha;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ResultadoValidacaoSenha validacaoSenha = lerSenha(teclado);
        if (validacaoSenha.isResultadoValidacao()) {
            System.out.println("Senha validada com sucesso");
        } else {
            System.out.println("Não foi possível validar a senha");
        }
    }

    public static ResultadoValidacaoSenha lerSenha(Scanner scanner) {
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();
        ValidarSenha validarSenha = new ValidarSenha();

        try {
            if (!validarSenha.validaSenha(senha)) {
                throw new SenhaInvalidaException(validarSenha.getMensagemValidacao());
            }

        } catch(SenhaInvalidaException e) {
            System.out.println("Erro de validação: " + e.getMessage());
            return new ResultadoValidacaoSenha(senha, false);
        } catch(Exception e ) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
        return new ResultadoValidacaoSenha(senha, true);
    }

}
