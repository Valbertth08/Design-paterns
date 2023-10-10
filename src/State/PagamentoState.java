package State;

public class PagamentoState implements  State{
    @Override
    public void MostrarEstadoAtual() {
        System.out.println("Pagamento efetuado com sucesso");
    }
}
