public class Cliente {

    public String elogiarDesenvolvedores(String mensagem) {
        return SAC.getInstancia().receberElogioDesenvolvedor(mensagem);
    }

    public String reclamarDesenvolvedores(String mensagem) {
        return SAC.getInstancia().receberReclamacaoDesenvolvedor(mensagem);
    }

    public String sugerirDesenvolvedores(String mensagem) {
        return SAC.getInstancia().receberSugestaoDesenvolvedor(mensagem);
    }
}
