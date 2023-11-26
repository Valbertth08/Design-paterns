package Interator;

import java.util.List;

public class ListaDeLivros implements Iteravel<Livro> {

    private Livro[] livros;
    private int tamanho;

     public ListaDeLivros(Livro[] livros) {

         this.livros = livros;
         this.tamanho = this.livros.length;
     }


    @Override
    public Iterator<Livro> itarator() {
        return new Iterator<Livro>() {
            private int i = 0;
            @Override
            public boolean temProximo() {
                return (this.i)<ListaDeLivros.this.tamanho;
            }
            @Override
            public Livro proximo() {
                return 	 ListaDeLivros.this.livros[i++];
            }

        };
    }
}
