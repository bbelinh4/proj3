package domain;

import java.util.Date;

public class Escala {
    private Aeroporto aeroporto;
    private Date Chegada;
    private Date Partida;
    
    public Escala(Aeroporto aeroporto, Date chegada, Date partida) {
        this.aeroporto = aeroporto;
        Chegada = chegada;
        Partida = partida;
    }
    public Aeroporto getAeroporto() {
        return aeroporto;
    }
    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }
    public Date getChegada() {
        return Chegada;
    }
    public void setChegada(Date chegada) {
        Chegada = chegada;
    }
    public Date getPartida() {
        return Partida;
    }
    public void setPartida(Date partida) {
        Partida = partida;
    }
    @Override
    public String toString() {
        return "Escala [aeroporto=" + aeroporto + ", Chegada=" + Chegada + ", Partida=" + Partida + "]";
    }

    
}
