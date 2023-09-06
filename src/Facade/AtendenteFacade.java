package Facade;

public class AtendenteFacade {
    private Financeiro financeiro;
    private Cozinha cozinha;

    public AtendenteFacade(Cozinha cozinha, Financeiro fInanceiro) {
        this.cozinha = cozinha;
        this.financeiro = fInanceiro;
    }

    public void RealizarPedido( Pedido p){
            p.RegistrarPedido(p);
            this.financeiro.receberPagamento(p.getCodigo(),p.getValor(),p.getNomeCliente());
            this.cozinha.PreparandoPedido(p.getCodigo());
            this.cozinha.PedidoPronto( p.getCodigo());
    }

}
