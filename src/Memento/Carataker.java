package Memento;

import java.util.ArrayList;
import java.util.List;

public class Carataker {
    private  List<MementoTexto> listaMementos = new ArrayList<>();

    public void addMemento( MementoTexto memento){
        listaMementos.add(memento);
    }

    public MementoTexto getIndiceMemento(int indice){
        return listaMementos.get(indice);
    }

}
