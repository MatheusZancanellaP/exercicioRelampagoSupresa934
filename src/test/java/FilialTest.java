import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void deveRetornarFilialSemCidade() {
        try {
            Filial filial = new Filial();
            filial.getNomeEstadoFilial();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Filial sem cidade", e.getMessage());
        }
    }
    @Test
    void deveRetornarCarlos(){
        Filial filial = new Filial();
        Empresa empresa = new Empresa();
        filial.setEmpresa(empresa);
        Funcionario diretor = new Funcionario();
        empresa.setDiretor(diretor);
        diretor.setNome("Carlos");
        assertEquals("Carlos",filial.getNomeDiretorEmpresaFilial());
    }
    @Test
    void deveRetornarFilialSemEmpresa(){
        try {
            Filial filial = new Filial();
            filial.getNomeDiretorEmpresaFilial();
            fail();
        } catch (NullPointerException e) {
            assertEquals("filial sem empresa", e.getMessage());
        }
    }

}