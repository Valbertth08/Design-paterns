package Strategy;

public class MensagemAudio  implements Mensagem{

    @Override
    public void FormaDeRecebimento() {
        System.out.println("Recebimento de mensagem por Audio");
    }

    @Override
    public void FormaCodificao() {
        System.out.println("Forma de Codificação  por Gravação");
    }

    @Override
    public void FormaDeCodificao() {
        System.out.println("Forma de Codificação  por Reprodução");
    }

    @Override
    public void FormaDeEnvio() {
        System.out.println("Enviando mensagem de Audio");
    }
}
