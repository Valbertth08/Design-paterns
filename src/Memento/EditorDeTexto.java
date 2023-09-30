package Memento;

public class EditorDeTexto {

    private String Texto;

    public String getTexto() {
        return Texto;
    }
    public void setTexto(String texto) {
        Texto = texto;
    }
    public MementoTexto SalvarEstado(){
        return  new MementoTexto(Texto);
    }

    public void RestauraMemento(MementoTexto mementoTexto){
        Texto= mementoTexto.getTexto();
    }

}
