package domain;

import java.util.List;

public class Voo {
    private String numero;
    private List<Escala> escalas;
    private List<Cliente> passageiros;
    
    public Voo(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public List<Escala> getEscalas() {
        return escalas;
    }
    public void setEscalas(List<Escala> escalas) {
        this.escalas = escalas;
    }
    public List<Cliente> getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(List<Cliente> passageiros) {
        this.passageiros = passageiros;
    }
    @Override
    public String toString() {
        return "Voo [numero=" + numero + ", escalas=" + escalas + ", passageiros=" + passageiros + "]";
    }

    
    
    
}
