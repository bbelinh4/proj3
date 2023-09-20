package domain;

public class Passagem {
    private String numero;
    private Cliente cliente;
    private Voo voo;
    
    public Passagem(String numero, Cliente cliente, Voo voo) {
        this.numero = numero;
        this.cliente = cliente;
        this.voo = voo;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Voo getVoo() {
        return voo;
    }
    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    @Override
    public String toString() {
        return "Passagem [numero=" + numero + ", cliente=" + cliente + ", voo=" + voo + "]";
    }

    
}
