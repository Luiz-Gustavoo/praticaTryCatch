package br.com.exercicio2.modelos;

public class ResultadoValidacaoSenha {
    private String senha;
    private boolean resultadoValidacao;

    public ResultadoValidacaoSenha(String senha, boolean resultadoValidacao) {
        this.senha = senha;
        this.resultadoValidacao = resultadoValidacao;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isResultadoValidacao() {
        return resultadoValidacao;
    }
}
