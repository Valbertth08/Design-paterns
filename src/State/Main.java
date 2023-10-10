package State;

public class Main {
    public static void main(String[] args) {

        State estado1= new PagamentoState();
        State estado2= new ExecutandoState();

        ProcessarState processar = new ProcessarState(estado1);
        processar.MostrarEstadoAtual();
        processar.setState(estado2);
        processar.MostrarEstadoAtual();

    }
}
