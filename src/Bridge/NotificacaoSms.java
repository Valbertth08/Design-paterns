package Bridge;

public class NotificacaoSms implements Notificacao {

    @Override
    public void notificar() {
        System.out.println("Enviamos uma mensagem de confirmação para o seu telefone.");
        System.out.print("Todas informações referente sua conta sera enviada por SMS.");
        System.out.println();
    }
}
