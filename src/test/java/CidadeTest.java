import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void deveRetornarCidadeSemEstado(){
        try {
            Cidade cidade = new Cidade();
            cidade.getNomeEstado();
            fail();
        } catch (NullPointerException e) {
            assertEquals("cidade sem estado", e.getMessage());
        }
    }

}
