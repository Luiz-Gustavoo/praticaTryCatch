package br.com.praticatrycatch.modelos;

public class ResultadoDivisao {
    private int resultadoNumerico;
    private boolean resultadoLogico;

    public ResultadoDivisao(int resultadoNumerico, boolean resultadoLogico) {
        this.resultadoNumerico = resultadoNumerico;
        this.resultadoLogico = resultadoLogico;
    }

    public int getResultadoNumerico() {
        return resultadoNumerico;
    }

    public boolean isResultadoLogico() {
        return resultadoLogico;
    }
}
