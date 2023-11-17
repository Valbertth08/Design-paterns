package Visitor;

public interface Mensagem {
    void EnviarMensagem(Festa festa);
    void EnviarMensagem(Reuniao reuniao);
    void EnviarMensagem(Conferencia conferencia);

}
