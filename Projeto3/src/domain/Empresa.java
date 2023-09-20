package domain;

import java.util.List;

public class Empresa {
    private List<Cliente> clientes;
    private List<Aeroporto> aeroportos;
    private List<Voo> voos;

    public List<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public List<Aeroporto> getAeroportos() {
        return aeroportos;
    }
    public void setAeroportos(List<Aeroporto> aeroportos) {
        this.aeroportos = aeroportos;
    }
    public List<Voo> getVoos() {
        return voos;
    }
    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }
    @Override
    public String toString() {
        return "Empresa [clientes=" + clientes + ", aeroportos=" + aeroportos + ", voos=" + voos + "]";
    }

    
    
    
}
