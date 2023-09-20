package domain;

public class Cidade {
    private String nomeCidade;

    public Cidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getNome() {
        return nomeCidade;
    }

    public void setNome(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    @Override
    public String toString() {
        return "Cidade [nome=" + nomeCidade + "]";
    }

    
}
