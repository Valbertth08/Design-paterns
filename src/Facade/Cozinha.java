package Facade;

public class Cozinha {

    public  void PreparandoPedido( Integer codigo){
        System.out.println("---------------------------------------------------------------");
        System.out.println("PREPARANDO PEDIDO:\nCódigo: "+codigo);
    }
    public void PedidoPronto( Integer codigo){
        System.out.println("---------------------------------------------------------------");
        System.out.println("PEDIDO PRONTO!\nCódigo: "+codigo);

    }
}
