package Interator;

public class Main {
    public static void main(String[] args) {

        Livro[] livros = new Livro[4];
        livros[0] = new Livro("Pequeno Principe", 200.0);
        livros[1] = new Livro("Rei Arthur", 50.0);
        livros[2] = new Livro("Design Partners", 89.0);
        livros[3] = new Livro("Java", 30.0);

        ListaDeLivros listaDeLivros = new ListaDeLivros(livros);
        Iterator<Livro> iterator = listaDeLivros.itarator();
        iterator.temProximo();
        while (iterator.temProximo()) {
            Livro livro = iterator.proximo();
            System.out.println(livro);
        }
    }
}
