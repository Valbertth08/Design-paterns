package Observer;

import java.util.Objects;

public class Usuario  implements notificarProduto{
    private  String name;
    private Integer id;

    public Usuario(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public void notificar(Produto p) {
        System.out.println("Notificação para: "+name);
        System.out.println("Alteração no valor do produto:\nNome: "+p.getName()+"\nId Produto: "+p.getId()+"\nPreço: "+String.format("%.2f.",p.getPrice()));
        System.out.println();
    }
}
