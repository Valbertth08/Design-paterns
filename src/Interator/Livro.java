package Interator;

public class Livro {

    private String nome;
    private Double valor;

    public Livro(String nome,Double valor) {

        this.nome = nome;
        this.valor=valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
