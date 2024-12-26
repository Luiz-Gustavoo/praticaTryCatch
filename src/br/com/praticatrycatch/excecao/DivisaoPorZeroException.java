package br.com.praticatrycatch.excecao;

public class DivisaoPorZeroException extends RuntimeException {
    private String mensagem;

    public DivisaoPorZeroException(String mensagem ) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
