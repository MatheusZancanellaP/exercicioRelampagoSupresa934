import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPaisAlocacaoFuncionario() {
        Pais pais = new Pais();
        pais.setNome("Alemanha");
        Empresa empresa = new Empresa();
        Grupo grupo = new Grupo();
        Departamento departamento = new Departamento();
        Funcionario funcionario = new Funcionario();
        funcionario.setAlocacao(departamento);
        departamento.setEmpresa(empresa);
        empresa.setGrupo(grupo);
        grupo.setSede(pais);
        assertEquals("Alemanha", funcionario.getPaisAlocacaoFuncionario());
    }

    @Test
    void deveRetornarFuncionarioSemAlocacao() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.getPaisAlocacaoFuncionario();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Sem alocacao !", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstadoFilialCoordenada(){
        Funcionario coordenador = new Funcionario();
        Filial filial = new Filial();
        coordenador.setCoordenacao(filial);
        Cidade cidade = new Cidade();
        Estado estado = new Estado();
        cidade.setEstado(estado);
        estado.setNome("RJ");
        filial.setCidade(cidade);
        assertEquals("RJ", coordenador.getNomeEstadoFilialFuncionarioCoordena());

    }
}