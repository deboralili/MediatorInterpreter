import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveElogiarDesenvolvedores() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece seu contato.\n" +
                        "Os desenvolvedores agradecem o contato e o elogio: Interface organizada.",
                cliente.elogiarDesenvolvedores("Interface organizada."));
    }

    @Test
    void deveReclamarDesenvolvedores() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece seu contato.\n" +
                        "Os desenvolvedores agradecem o contato e vão procurar melhorar.",
                cliente.reclamarDesenvolvedores("Interface confusa."));
    }

    @Test
    void deveSugerirDesenvolvedores() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece seu contato.\n" +
                        "A sujestão: Aumentar tamanho da fonte das letras." +
                        "\n Será analisada pelos desenvolvedores. Os desenvolvedores agradecem o contato.",
                cliente.sugerirDesenvolvedores("Aumentar tamanho da fonte das letras."));
    }
}