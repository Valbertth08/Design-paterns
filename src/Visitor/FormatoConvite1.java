package Visitor;

public class FormatoConvite1 implements Mensagem{
    @Override
    public void EnviarMensagem(Festa festa) {
       System.out.println("------ FORMATO CONVITE 1-------");
    }
    @Override
    public void EnviarMensagem(Reuniao reuniao) {
        System.out.println("------ FORMATO CONVITE 1-------");
    }

    @Override
    public void EnviarMensagem(Conferencia conferencia) {
        System.out.println("------ FORMATO CONVITE 1-------");
    }
}
