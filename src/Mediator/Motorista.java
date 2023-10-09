package Mediator;


import java.util.Comparator;

abstract class Motorista  {
    private String name;
    private Double preco;
    private Mediator mediator;

    public Motorista(String name, Double preco, Mediator mediator) {
        this.name = name;
        this.preco = preco;
        this.mediator = mediator;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    abstract   Double enviarPreco( Motorista motorista);

}
