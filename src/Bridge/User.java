package Bridge;

public class User {
    private  String name;

    private Integer senha;

    private Notificacao notificacao;

    public User(String name, Integer senha, Notificacao notificacao) {
        this.name = name;
        this.senha = senha;
        this.notificacao = notificacao;
    }

    public String getName() {
        return name;
    }

    public Integer getSenha() {
        return senha;
    }
    public Notificacao getNotificacao() {
        return notificacao;
    }


}
