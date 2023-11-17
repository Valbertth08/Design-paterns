package Visitor;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEvento {

   private List<Evento> eventos= new ArrayList<>();

    public  void addEvento(Evento evento){
        eventos.add(evento);
    }

    public void EnviaMensagem( Mensagem mensagem){
        for (Evento e: this.eventos){
            e.EnviarConvite(mensagem);
        }

    }
}
