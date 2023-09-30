package Memento;

public class Main {

    public static void main(String[] args) {

        EditorDeTexto texto = new EditorDeTexto();
        Carataker guardiao= new Carataker();

        texto.setTexto("Titulo");
        guardiao.addMemento(texto.SalvarEstado());//no momento que eu salvo o estado é criado(retornado) um memento e adicionado no guardião.

        texto.setTexto("Paragrafo 1");
        guardiao.addMemento(texto.SalvarEstado());

        texto.setTexto("Paragrafo 2");
        guardiao.addMemento(texto.SalvarEstado());
        //Voltando ao estado anterior
        texto.RestauraMemento(guardiao.getIndiceMemento(1));//nesse momento é retornado o memento de acordo com o indice e internamente é passado o valor correspondente a esse estado

        System.out.println(texto.getTexto());
        //Refazendo a operação
        texto.RestauraMemento(guardiao.getIndiceMemento(2));
        System.out.println(texto.getTexto());
    }
}
