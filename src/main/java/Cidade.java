public class Cidade {

    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public String getNomeEstado(){
        if(this.estado == null){
            throw new NullPointerException("cidade sem estado");
        }
        return this.estado.getNome();
    }
}