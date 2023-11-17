package Visitor;

import java.time.LocalDate;

public abstract class Evento implements Convidar {
   private LocalDate data ;
   private String nomeEvento;

    public Evento(LocalDate data, String nomeEvento) {
        this.data = data;
        this.nomeEvento = nomeEvento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
}
