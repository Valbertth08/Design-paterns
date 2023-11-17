package Visitor;

public class FormatoConvite2 implements Mensagem{
    @Override
    public void EnviarMensagem(Festa festa) {
        System.out.println("------ FORMATO CONVITE 2-------");
    }

    @Override
    public void EnviarMensagem(Reuniao reuniao) {
        System.out.println("------ FORMATO CONVITE 2-------");
    }

    @Override
    public void EnviarMensagem(Conferencia conferencia) {
        System.out.println("------ FORMATO CONVITE 2-------");
    }
}
