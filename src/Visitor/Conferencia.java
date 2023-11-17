package Visitor;

import java.time.LocalDate;

public class Conferencia extends Evento{

    public Conferencia(LocalDate data, String nomeEvento) {
        super(data, nomeEvento);
    }

    @Override
    public void EnviarConvite(Mensagem mensagem) {
        mensagem.EnviarMensagem(this);
        System.out.println("Data: "+getData()+"\nNome do Evento: "+getNomeEvento()+"\n\n");

    }
}
