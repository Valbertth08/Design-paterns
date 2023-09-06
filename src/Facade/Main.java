package Facade;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        String nomeCliente = "Jose Abreu";
        Integer codigo = 123;
        Double valor= 200.00;

        Pedido pedido = new Pedido(nomeCliente,codigo,valor);

        AtendenteFacade atendenteFacade= new AtendenteFacade(new Cozinha(), new Financeiro());
        atendenteFacade.RealizarPedido(pedido);
    }
}
