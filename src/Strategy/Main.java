package Strategy;

public class Main {

    public static void main(String[] args) {

        ProcessarMensagem processar = new ProcessarMensagem(new MensagemTexto());
        processar.ProcessandoMensagem();
        System.out.println();
        processar.setMensagem(new MensagemAudio());
        processar.ProcessandoMensagem();
    }
}
