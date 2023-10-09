package Strategy;

public class MensagemVideo implements Mensagem{


    @Override
    public void FormaDeRecebimento() {
        System.out.println("Recebimento de mensagem por video");
    }

    @Override
    public void FormaCodificao() {
        System.out.println("Forma de Codificação  por Compressão");
    }

    @Override
    public void FormaDeCodificao() {
        System.out.println("Forma de DeCodificação  por Compressão");
    }

    @Override
    public void FormaDeEnvio() {
        System.out.println("Enviando mensagem por Video");
    }
}
