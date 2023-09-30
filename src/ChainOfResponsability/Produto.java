package ChainOfResponsability;

public class Produto {

    private String nome;
    private Double preco;

   private EnumCategoriaProduto categoria;
    public Produto(String nome, Double preco, EnumCategoriaProduto categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public EnumCategoriaProduto getCategoria() {
        return categoria;
    }


}
