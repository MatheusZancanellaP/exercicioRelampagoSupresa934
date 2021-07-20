import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class GrupoTest {



    @Test
    void deveRetornarEscolaridadePresidente() {
        Grupo grupo = new Grupo();
        Funcionario presidente = new Funcionario();
        grupo.setPresidente(presidente);
        Escolaridade escolaridade = new Escolaridade();
        presidente.setEscolaridade(escolaridade);
        escolaridade.setDescricaoEscolaridade("Fundamental");
        assertEquals("Fundamental",grupo.getEscolaridadePresidente());
    }
}