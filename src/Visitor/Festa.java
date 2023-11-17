package Visitor;

import java.time.LocalDate;

public class Festa extends Evento{

    public Festa(LocalDate data, String nomeEvento) {
        super(data, nomeEvento);
    }

    @Override
    public void EnviarConvite(Mensagem mensagem) {
        mensagem.EnviarMensagem(this);
        System.out.println("Data: "+getData()+"\nNome do Evento: "+getNomeEvento()+"\n\n");
    }
}
