package Strategy;

public class ProcessarMensagem {

    private Mensagem mensagem;

    public ProcessarMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
    public void ProcessandoMensagem(){
        mensagem.FormaDeEnvio();
        mensagem.FormaCodificao();
        mensagem.FormaDeCodificao();
        mensagem.FormaDeRecebimento();
    }

}
