import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarDepartamentoSemEmpresa(){
            try {
                Departamento departamento = new Departamento();
                departamento.getPaisEmpresaDepartamento();
                fail();
            } catch (NullPointerException e) {
                assertEquals("Departamento sem empresa", e.getMessage());
            }
        }
    @Test
        void deveRetornarEnsinoSuperior(){
        Departamento departamento = new Departamento();
        Funcionario chefe = new Funcionario();
        departamento.setChefe(chefe);
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricaoEscolaridade("Superior");
        chefe.setEscolaridade(escolaridade);
        assertEquals("Superior",departamento.getEscolaridadeChefeDepartamento());
    }
}