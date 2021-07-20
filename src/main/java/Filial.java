public class Filial {

    private Cidade cidade;
    private Empresa empresa;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getNomeEstadoFilial(){
        if(this.cidade == null){
            throw new NullPointerException("Filial sem cidade");
        }
        return this.cidade.getNomeEstado();
    }

    public String getNomeDiretorEmpresaFilial(){
        if(this.empresa == null){
            throw new NullPointerException("filial sem empresa");
        }
        return this.empresa.getNomeDiretorEmpresa();
    }
}