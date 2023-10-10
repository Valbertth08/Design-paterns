package Strategy;

public class Main {

    public static void main(String[] args) {

        ProcessarMensagem processar1 = new ProcessarMensagem(new MensagemTexto());
        processar1.ProcessandoMensagem();
        System.out.println();
        ProcessarMensagem processar2 = new ProcessarMensagem(new MensagemAudio());
        processar2.ProcessandoMensagem();

    }
}
