package Composite;

public class Jogo  implements CompositeCaixa{

    private String name;
    private Double preco;

    public Jogo(String name, Double preco) {
        this.name = name;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public Double getPreco() {
        return preco;
    }


    @Override
    public void mostrarJogo() {
        System.out.println("nome=" + name +" Preco: "+preco);
    }
}
