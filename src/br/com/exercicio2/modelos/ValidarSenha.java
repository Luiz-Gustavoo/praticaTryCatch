package br.com.exercicio2.modelos;

public class ValidarSenha {
    private String mensagemValidacao = "";

    public String getMensagemValidacao() {
        return mensagemValidacao;
    }

    public boolean validaSenha(String senha) {

        if (senha.isEmpty()) {
            mensagemValidacao = "Senha vazia é inválida; ";
            return false;
        }

        if (senha.length() < 8) {
            mensagemValidacao = "A senha precisa ter 8 ou mais caracteres";
            return false;
        }

        return true;
    }
}
