package Observer;

import java.util.HashSet;
import java.util.Set;

public class Produto {
    private String name;
    private Double price;
    private Integer id;

    private Set<notificarProduto> notificar = new HashSet<>();
    public Produto(String name, Double price, Integer id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Double getPrice() {

        return price;
    }
    public Integer getId() {

        return id;
    }

    public void setPrice(Double price) {
        this.price = price;
        for (notificarProduto n: this.notificar){
            n.notificar(this);
        }
    }

    public Set<notificarProduto> getNotificar() {
        return notificar;
    }

    public void addInterassado(notificarProduto notificar){
        this.notificar.add(notificar);
   }

    public void removeInterassado(notificarProduto notificar){

        this.notificar.remove(notificar);
    }
}
