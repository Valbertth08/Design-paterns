package Strategy;

public class MensagemTexto implements Mensagem{

    @Override
    public void FormaDeRecebimento() {
        System.out.println("Recebimento mensagem por SMS");
    }

    @Override
    public void FormaCodificao() {
    System.out.println("Forma de codificação GSM 7-bit");
    }

    @Override
    public void FormaDeCodificao() {
        System.out.println("Forma de Decodificação GSM 7-bit");
    }

    @Override
    public void FormaDeEnvio() {
        System.out.println("Enviando mensagem por SMS");
    }
}
