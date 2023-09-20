package domain;

import java.util.List;

public class Cliente {
    private String idCliente;
    private String nomeCliente;
    private List<Passagem> passagens;
    
    public Cliente(String idCliente, String nomeCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
    }
    public String getId() {
        return idCliente;
    }
    public void setId(String idCliente) {
        this.idCliente = idCliente;
    }
    public String getNome() {
        return nomeCliente;
    }
    public void setNome(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public List<Passagem> getPassagens() {
        return passagens;
    }
    public void setPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }
    @Override
    public String toString() {
        return "Cliente [id=" + idCliente + ", nome=" + nomeCliente + ", passagens=" + passagens + "]";
    }

    
}
