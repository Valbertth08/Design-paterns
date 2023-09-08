package Bridge;

public class NotificacaoEmail  implements Notificacao{
    @Override
    public void notificar() {
        System.out.println("Enviamos uma mensagem de confirmação para o seu email.");
    }
}
