package Strategy;

public class Main {

    public static void main(String[] args) {

        ProcessarMensagem processar1 = new ProcessarMensagem(new MensagemTexto());
        processar1.ProcessandoMensagem();

        ProcessarMensagem processar2 = new ProcessarMensagem(new MensagemTexto());
        processar2.ProcessandoMensagem();

    }
}
