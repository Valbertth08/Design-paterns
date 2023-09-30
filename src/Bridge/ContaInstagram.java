package Bridge;

public class ContaInstagram  implements RedeSocial{
    private User user;
    private Notificacao notificacao;

    public ContaInstagram(User user, Notificacao notificacao) {
        this.user = user;
        this.notificacao = notificacao;
    }
    public User getUser() {

        return user;
    }

    public Notificacao getNotificacao() {
        return notificacao;
    }
    @Override
    public void TipoDenotificacao() {
        notificacao.notificar();
    }
}

