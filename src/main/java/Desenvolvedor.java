public class Desenvolvedor implements Setor {

    private static Desenvolvedor instancia = new Desenvolvedor();

    private Desenvolvedor() {}

    public static Desenvolvedor getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "Os desenvolvedores agradecem o contato e vão procurar melhorar.";
    }

    public String receberElogio(String mensagem) {
        return "Os desenvolvedores agradecem o contato e o elogio: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A sujestão: " + mensagem + "\n Será analisada pelos desenvolvedores. Os desenvolvedores agradecem o contato.";
    }
}
