public class SAC {

    private static SAC instancia = new SAC();

    private SAC() {}

    public static SAC getInstancia() {
        return instancia;
    }

    public String receberElogioDesenvolvedor(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                Desenvolvedor.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoDesenvolvedor(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                Desenvolvedor.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoDesenvolvedor(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                Desenvolvedor.getInstancia().receberSugestao(mensagem);
    }

}