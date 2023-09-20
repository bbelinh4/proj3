package domain;

public class Aeroporto {
    private String nomeAeroporto;
    private Cidade cidade;
    public Aeroporto(String nomeAeroporto, Cidade cidade) {
        this.nomeAeroporto = nomeAeroporto;
        this.cidade = cidade;
    }
    public String getNome() {
        return nomeAeroporto;
    }
    public void setNome(String nomeAeroporto) {
        this.nomeAeroporto = nomeAeroporto;
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    @Override
    public String toString() {
        return "Aeroporto [nome=" + nomeAeroporto + ", cidade=" + cidade + "]";
    }

    
}
