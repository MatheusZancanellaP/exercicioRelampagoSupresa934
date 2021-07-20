
public class Funcionario {
    private String Nome;
    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }
    public String getGrauEscolaridade(){
        return this.escolaridade.getDescricaoEscolaridade();
    }
    public String getPaisAlocacaoFuncionario(){
        if(this.alocacao == null){
            throw new NullPointerException("Sem alocacao !");
        }

        return this.getAlocacao().getPaisEmpresaDepartamento();

    }
    public String getNomeEstadoFilialFuncionarioCoordena(){
        return this.getCoordenacao().getNomeEstadoFilial();
    }

}
